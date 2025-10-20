class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char ch:tasks) 
        freq[ch-'A']++;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:freq) {
            if(i>0) pq.add(i);
        }
        int interval=0;
        while(!pq.isEmpty()) {
            List<Integer> temp=new ArrayList<>();
            int cnt=n+1;
            while(cnt!=0 && !pq.isEmpty()) {
                int curr=pq.remove();
                if(curr>1) temp.add(curr-1);
                interval++;
                cnt--;
            }
            for(int i:temp) pq.add(i);
            if(pq.isEmpty()) break;
            interval+=cnt;
        }
        return interval;
    }
}