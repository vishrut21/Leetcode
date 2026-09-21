class Solution {
    public int[] separateDigits(int[] nums) {
         StringBuilder sb = new StringBuilder();
         for(int num: nums){
            sb.append(num);
         }
        return sb.toString().chars().map(c -> c - '0').toArray();
    }
}