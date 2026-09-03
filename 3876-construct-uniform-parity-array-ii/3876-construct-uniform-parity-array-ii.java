class Solution{
    public boolean uniformArray(int[] nums1){
        int n = nums1.length;
        int c = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            if(nums1[i] %2 == 0){
                c++;
            }
            min = Math.min(min, nums1[i]);
        }
        if(min%2 !=0){
            return true;
        }else if(n == c){
            return true;
        }else{
            return false;
        }
    }
}