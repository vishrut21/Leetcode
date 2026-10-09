class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int n = blocks.length();
        for(int i = 0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                count++;
            }
        }
        int ans = count;
        for(int i=0; i<n-k; i++){
                if(blocks.charAt(i) == 'W'){
                    count--;
                }
                if(blocks.charAt(i+k) == 'W'){
                    count++;
                }
            ans = Math.min(ans, count);
        }
        return ans;
    }
}