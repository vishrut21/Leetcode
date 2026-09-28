class Solution {
    public static boolean pos(int[] nums, int mid, int threshold){
        int calth=0;
        for(int num : nums){
            calth += (num + mid - 1) / mid;
        }
        return calth<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int num: nums){
            high = Math.max(num, high);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(pos(nums, mid, threshold)){
                 high = mid-1;
               
            }else{
                low  = mid +1;
            }
        }
    return low;
    }
}