class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, end = 0, maxFreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        while(end < s.length()){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            maxFreq =Math.max(maxFreq,map.get(s.charAt(end)));
            while((end-start+1)-maxFreq > k){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}