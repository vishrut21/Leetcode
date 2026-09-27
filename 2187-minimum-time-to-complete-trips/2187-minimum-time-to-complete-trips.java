class Solution {
    public static boolean pos(int[] time, long mid, int totalTrips){
        long count = 0;
        for(int ti : time){
            count += mid/ti;
        }
        return count >= totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high=0;
        for(int t : time){
            high += t;
        }
        high = high*totalTrips;
        while(low<= high){
            long mid = low + (high-low)/2;
            if(pos(time, mid, totalTrips)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}