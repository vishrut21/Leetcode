class Solution {
    private boolean poss(int[] tasks, int[] workers, int pills, int strength, int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int j = workers.length - 1;
        int minWorker = workers.length - k;

        for(int i = k-1; i>= 0; i--){
            while(j>= minWorker && (long)workers[j] + strength >= tasks[i]){
                dq.addFirst(workers[j]);
                j--;
            }
            if(dq.isEmpty()){
                return false;
            }
            if(dq.peekLast()>= tasks[i]){
                dq.pollLast();
            }else{
                if(pills == 0){
                    return false;
                }
                pills--;
                dq.pollFirst();
            }
        }
        return true;
    }
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
      Arrays.sort(tasks);
    Arrays.sort(workers);
    int low = 0;
    int high = Math.min(tasks.length, workers.length);
    int ans = 0;
    while(low<=high){
        int mid =  low+(high-low)/2;
        if(poss(tasks, workers, pills, strength, mid)){
            ans = mid;
            low = mid +1;
        }else{
            high = mid-1;
        }
    }
    return ans;
    }
}