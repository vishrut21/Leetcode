class Solution {
    public int[] maxSlidingWindow(int[] nums, int k){
        int start = 0, end = 0;
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        while(end<n){
            mp.put(nums[end], mp.getOrDefault(nums[end], 0)+1);

            if(end - start + 1 == k){
                ans[start] = mp.lastKey();
                mp.put(nums[start], mp.get(nums[start]) - 1);

                if(mp.get(nums[start]) == 0){
                    mp.remove(nums[start]);
                }
                start++;
            }
            end++;
        }

        return ans;
    }
}