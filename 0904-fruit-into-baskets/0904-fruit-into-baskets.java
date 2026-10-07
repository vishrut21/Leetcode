class Solution {
    public int totalFruit(int[] fruits) {
       int start =0, end = 0, max_ans = 0;
       HashMap<Integer, Integer> mp = new HashMap<>();
       while(end<fruits.length){
        mp.put(fruits[end],mp.getOrDefault(fruits[end], 0)+1);
            while(start<=end && mp.size()>2){
                mp.put(fruits[start],mp.get(fruits[start])-1);
                if(mp.get(fruits[start])==0){
                    mp.remove(fruits[start]);
                }
                start++;
            }
        max_ans = Math.max(max_ans, end-start+1);
        end++;
       } 
       return max_ans;
    }
}