class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for( int i = 0; i<s.length(); i++){
                int ind = s.charAt(i) - 'a';
                count[ind]++;
        }
        for( int i = 0; i<t.length(); i++){
                int ind = t.charAt(i) - 'a';
                count[ind]--;
        }
        for(int i = 0; i<26 ; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}