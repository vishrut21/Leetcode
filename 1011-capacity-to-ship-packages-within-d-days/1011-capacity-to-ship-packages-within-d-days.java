class Solution {
    public boolean pos(int[] weights, int mid, int days) {
    int total_day = 1;
    int current = 0;

    for (int weight : weights) {
        if (current + weight > mid) {
            total_day++;
            current = weight;
        } else {
            current += weight;
        }
    }

    return total_day <= days;
}
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int weight : weights){
            low = Math.max(weight, low);
            high +=weight;
        }
        while(low<= high){
            int mid = low + (high-low)/2;
            if(pos(weights, mid, days)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
    return low;

    }
}