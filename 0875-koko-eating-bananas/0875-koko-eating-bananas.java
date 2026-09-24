class Solution {
    public static boolean pos(int[] piles, int mid, int h){
        long total = 0;
        for (int num : piles) {
            total += (num + mid - 1) / mid;
        }
        return total<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
            // sum += piles[i];
        }
        int low = 1;
        int high = max;

        while(low<= high){
            int  mid = low + (high-low)/2;
            if(pos(piles, mid,h)){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return (int)low;
    }
}