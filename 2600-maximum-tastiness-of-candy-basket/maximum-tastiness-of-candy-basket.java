class Solution {
    public int maximumTastiness(int[] price, int k) {
        int l=price.length;
        mergeSort(price,0,l-1);
        int low=1,high=price[l-1]-price[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            int last=price[0],count=1;
            for(int i=1;i<l;i++){
                if(price[i]-last>=mid) {
                    count++;
                    if(count>=k) break;
                    last=price[i];
                }
            }
            if(count>=k) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    public int[] mergeSort(int ar[], int low, int high) {
        if (low >= high)
            return ar;
        int mid = (low + high) / 2;
        mergeSort(ar, low, mid);
        mergeSort(ar, mid + 1, high);
        return merge(ar, low, mid, high);
    }
    public int[] merge(int ar[], int low, int mid, int high) {
        List<Integer> test = new ArrayList<>();
        int left = low, right = mid+1;
        while (left <= mid && right <= high) {
            if (ar[left] < ar[right]) {
                test.add(ar[left]);
                left++;
            } else {
                test.add(ar[right]);
                right++;
            }
        }
        while (left <= mid) {
            test.add(ar[left]);
            left++;
        }
        while (right <= high) {
            test.add(ar[right]);
            right++;
        }
        for (int i = low; i <= high; i++)
            ar[i] = test.get(i - low);
        return ar;
    }
}