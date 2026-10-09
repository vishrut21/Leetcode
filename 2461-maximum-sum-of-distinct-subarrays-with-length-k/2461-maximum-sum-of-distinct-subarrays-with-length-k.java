class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        long max= 0;
        long sum = 0;
        int start = 0, end = 0;
        while(end<nums.length){
            sum += nums[end];
            mp.put(nums[end], mp.getOrDefault(nums[end], 0) +1);
            if((end-start+1) == k){
                if(mp.size() == k){
                    max = Math.max(max, sum);
                }
                sum -= nums[start];
                mp.put(nums[start], mp.get(nums[start])-1);

                if(mp.get(nums[start]) == 0){
                    mp.remove(nums[start]);
                }
                start++;
            }
            end++;
        }
        return max;
    }
}