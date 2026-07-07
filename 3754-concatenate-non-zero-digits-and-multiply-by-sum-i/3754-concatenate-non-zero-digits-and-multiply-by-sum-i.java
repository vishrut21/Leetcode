class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long p = 1;

        while(n>0){
           int dig = n%10;
           if(dig != 0){
            sum = sum + dig;
            x = dig*p +x;
            p = p*10;
           }
           n = n/10;
        }
        return sum*x;
    }
}