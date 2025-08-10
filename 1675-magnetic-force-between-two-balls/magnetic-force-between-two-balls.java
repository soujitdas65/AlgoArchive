class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=position.length;
        int low=1,high=position[l-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            int last=position[0],count=1;
            for (int i=1;i<l;i++){
                if(position[i]-last>=mid){
                    count++;
                    if(count>=m) break;
                    last=position[i];
                }
            }
            if(count<m) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}