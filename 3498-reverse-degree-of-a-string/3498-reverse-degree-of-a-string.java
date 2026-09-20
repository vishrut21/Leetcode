class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int rd =0;
        int ri =0;
       for( int i = 0; i<s.length() ;i++){
        ri = 26 - (s.charAt(i)- 'a') ;
        rd = ri*(i+1);
        sum = sum + rd;        
       }
       return sum;
    }
}