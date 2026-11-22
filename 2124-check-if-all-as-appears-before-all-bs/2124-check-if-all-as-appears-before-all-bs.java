class Solution {
    public boolean checkString(String s) {
        boolean seen = false;
        for(char c : s.toCharArray()){
            if(c == 'b'){
                seen = true;
            }else if(seen){
                return false;
            }
        }
        return true;
    }
}