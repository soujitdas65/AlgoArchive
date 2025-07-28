class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int l = intervals.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (list.isEmpty() || intervals[i][0] > list.get(list.size() - 1).get(1))
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            else
                list.get(list.size() - 1).set(1, Math.max(list.get(list.size() - 1).get(1), intervals[i][1]));
        }
        int ans[][] = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}