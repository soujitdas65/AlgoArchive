class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(0,nums,0,nums.length-1);
    }
    int mergeSort(int count,int nums[],int low,int high){
        if(low>=high) return count;
        int mid=(low+high)/2;
        count=mergeSort(count,nums,low,mid);
        count=mergeSort(count,nums,mid+1,high);
        count=merge(count,nums,low,mid,high);
        return count;
    }
    int merge(int count,int nums[],int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int j=mid+1;        
        for (int i=low;i<=mid;i++){
            while(j<=high && (long)nums[i]>2L*nums[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        int i=low;
        j=mid+1;        
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]) temp.add(nums[i++]);
            else temp.add(nums[j++]);
        }
        while(i<=mid) temp.add(nums[i++]);
        while(j<=high) temp.add(nums[j++]);
        for (int x=low;x<=high;x++) nums[x]=temp.get(x-low);
        return count;
    }
}