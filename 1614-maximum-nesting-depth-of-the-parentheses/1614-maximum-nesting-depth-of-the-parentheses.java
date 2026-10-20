class Solution {
    public int maxDepth(String s) {
        int maxd = 0;
        Stack<Character> br = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                br.push(c);
                maxd = Math.max(maxd, br.size());
            }else if(c == ')'){
                br.pop();
            }
        }
        return maxd;
    }
}