class Solution {
    public static boolean pos(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int bou = 0;

    
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count == k){
                    bou++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        
        }
        return bou >= m;
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 0;
        for(int day : bloomDay){
            high  = Math.max(day, high);
        }
        if((long)m*k > bloomDay.length){
            return -1;
        }
        while(low<=high){
            int mid  = low + (high-low)/2;
            if(pos(bloomDay, mid, m, k)){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}