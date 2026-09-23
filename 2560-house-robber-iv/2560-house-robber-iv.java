class Solution {
    static boolean cando(int[] nums, int k, int cap){
        int count = 0;
        for( int i= 0; i<nums.length;){
            if(nums[i]<= cap){
                count++;
                i+=2;
            }else{
                i++;
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
    public int minCapability(int[] nums, int k) {
     int min =  Integer.MAX_VALUE;
      int max=  Integer.MIN_VALUE;
    int n = nums.length;
      for(int i = 0 ; i<n;i++){
        min = Math.min(nums[i], min);
        max = Math.max(nums[i], max);
      }
      int low = min;
      int high  = max;
      while(low<high){
        int mid= low + (high-low)/2;
        if(cando(nums, k, mid)){
            high = mid;
        }else{
            low = mid+1;
        }
      }
      return low;
    }
}