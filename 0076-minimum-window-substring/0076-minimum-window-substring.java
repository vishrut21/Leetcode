class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int[] need = new int[128];
        for(char ch : t.toCharArray()){
            need[ch]++;
        }

        int start = 0;
        int end = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while(end < s.length()){
            char ch = s.charAt(end);

            if(need[ch] > 0){
                count--;
            }

            need[ch]--;
            end++;
            while(count == 0){
                if(end -start < minLen){
                    minLen = end - start;
                    minStart = start;
                }

                char leftChar = s.charAt(start);
                need[leftChar]++;

                if(need[leftChar] > 0){
                    count++;
                }
                start++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }else{

        
        return s.substring(minStart, minStart + minLen);
        }
    }
}
