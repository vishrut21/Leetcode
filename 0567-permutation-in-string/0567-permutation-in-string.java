class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int start = 0, end = 0;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(char ch : s1.toCharArray()){
            f1[ch-'a']++;
        }
        while(end < s2.length()){
            f2[s2.charAt(end)-'a']++;
            if(end-start+1 > s1.length()){
                f2[s2.charAt(start)-'a']--;
                start++;
            }
            if(end-start+1 == s1.length()){
                if(Arrays.equals(f1,f2)){
                    return true;
                }
            }
            end++;
        }
        return false;

    }
}