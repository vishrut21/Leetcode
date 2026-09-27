class Solution {
    public static long calcost(int[] nums, int[] cost, long target){
        long total = 0;
        for(int i = 0; i<nums.length; i++){
            total += Math.abs(target - nums[i])*cost[i];
        }
        return total;
            }
    public long minCost(int[] nums, int[] cost) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int num: nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        long low = min;
        long high = max;
        while(low<high){
            long mid = low + (high-low)/2;
            long leftcost = calcost(nums, cost , mid);
            long rightcost = calcost(nums, cost , mid+1);
            if(rightcost<leftcost){
                low = mid+1;
            }else{
                high = mid;
            }

        }
        return calcost(nums, cost, low);
    }
}