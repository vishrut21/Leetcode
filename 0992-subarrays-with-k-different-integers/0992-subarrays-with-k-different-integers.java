class Solution {
    private int atmost(int[] nums, int k){
        if(k<= 0){
            return 0;
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        int start = 0;
        int end= 0;
        int count = 0;
        while(end<nums.length){
            mp.put(nums[end], mp.getOrDefault(nums[end], 0)+1);
            while(mp.size()>k){
                int value = nums[start];
                mp.put(value, mp.get(value)-1);
                if(mp.get(value) == 0){
                    mp.remove(value);
                }
                start++;
            }
            count += (end-start+1);
            end++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k)-atmost(nums , k-1);
    }
}