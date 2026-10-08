class Solution {
    public int maxVowels(String s, int k) {
        int max;
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        max= count;
        for(int h = k; h < s.length(); h++){
            if(isVowel(s.charAt(h - k))){ 
                count--;
            }
            if(isVowel(s.charAt(h))){  
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}