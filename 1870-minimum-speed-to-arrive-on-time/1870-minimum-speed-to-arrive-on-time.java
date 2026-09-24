class Solution {
    public static boolean poss(int[] dist, int mid , double hour){
        double current = 0;
        for(int i = 0; i<dist.length -1; i++){
            current += Math.ceil((double)dist[i]/mid);
        }
        current = current + (double)dist[dist.length-1]/mid;
        return current <= hour;

    }
    public int minSpeedOnTime(int[] dist, double hour) {
        // if(hour<=dist.length-1){
        //     return -1;
        // }
        int low = 1;
        int high = 10000000;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(poss(dist, mid, hour)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low <= 10000000 ? low : -1;
    }
}