class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max= 0;

        for(int x : candies){
            max = Math.max(x, max);
        }
        for(int c : candies){
            arr.add(c + extraCandies >= max);
        }
        return arr;
    }
}