class Solution {
    public static long gen_sum(int mid, int space){
        if (space < mid) {
            long a = mid -space;
            long b = mid - 1;
            return (a + b)*(b - a + 1)/2;
        }
        long enough_space_sum = (long)(mid-1)*mid/2;
        long ones = space - (mid-1);
        return enough_space_sum + ones;
    }
    public static boolean pos(int n, int mid, int index, int maxSum){
        int left_space = index;
        int right_space = n - index -1;
        long total = mid;
       long ls = gen_sum(mid, left_space);
       long rs = gen_sum(mid, right_space);
        return (ls + rs + mid)<=maxSum;
    }
    public int maxValue(int n, int index, int maxSum) {
        int low = 1;
        int high = maxSum - n +1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(pos(n, mid, index, maxSum)){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
}