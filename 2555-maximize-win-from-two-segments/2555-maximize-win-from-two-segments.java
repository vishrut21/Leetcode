class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
       int n = prizePositions.length;
       int[] dp = new int[n + 1];
        int maxPrizes = 0;
        int left = 0;
        
        for(int right = 0;right < n; right++){
            while (prizePositions[right] - prizePositions[left] > k) {
                left++;
            }
            int currentSegmentPrizes = right - left + 1;
            maxPrizes = Math.max(maxPrizes, currentSegmentPrizes + dp[left]);
           
            dp[right + 1] = Math.max(dp[right], currentSegmentPrizes);
        }    
    return maxPrizes; 
    }
}