class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        int[][] q = new int[m][2];

        for(int i = 0; i < m; i++){
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q, (a, b) -> Integer.compare(a[0], b[0]));

        int[] ans = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;

        for(int i = 0; i < m;i++){

            int right = q[i][0];
            int left = right - x;

            while(end<logs.length && logs[end][1] <= right){
                int id = logs[end][0];
                map.put(id, map.getOrDefault(id, 0) + 1);
                end++;
            }
            while(start < logs.length && logs[start][1] < left){
                int id = logs[start][0];
                map.put(id, map.get(id) - 1);

                if(map.get(id) == 0){
                    map.remove(id);
                }
                start++;
            }
            ans[q[i][1]] = n - map.size();
        }

        return ans;
    }
}