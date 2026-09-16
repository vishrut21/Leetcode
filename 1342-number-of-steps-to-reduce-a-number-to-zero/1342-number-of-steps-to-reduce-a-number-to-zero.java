class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        int bitlength = 32 - Integer.numberOfLeadingZeros(num);
        int ones = Integer.bitCount(num);
        return bitlength + ones -1;
    }
}