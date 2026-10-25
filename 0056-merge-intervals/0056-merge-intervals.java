class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> tempresult = new ArrayList<>();
        for(int i = 1; i<intervals.length; i++){

            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                tempresult.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }

        }
        tempresult.add(new int[] {start, end});
        int[][] finalres = new int[tempresult.size()][2];
        int index = 0;
        for(int[] interval : tempresult){
            finalres[index++] = interval;
        }
        return finalres;
    }
}