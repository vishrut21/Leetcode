class Solution {
    public static boolean pos(int[] candies, int mid, long k){
        long total = 0;
        for(int i =0;i<candies.length; i++){
            total += candies[i]/mid;
        }
        return total>=k;
    }
    public int maximumCandies(int[] candies, long k) {
     int low = 1;
     int high = 0;
     for (int i = 0; i < candies.length; i++) {
            high = Math.max(high, candies[i]);
        }
     while(low<= high){
        int mid = low + (high-low)/2;
        if(pos(candies, mid , k)){
            low = mid+1;
        }else{
            high = mid-1;
        }
     }   
     return high;
    }
}