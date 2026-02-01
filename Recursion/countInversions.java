public class countInversions {
    public static int count = 0;
    public static void divide(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = low + (high - low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }else{
                count += (mid-left+1);
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }
    public static long numberOfInversions(int[] nums) {
        divide(nums, 0, nums.length-1);
        return count;
    }
    public static void main(String[] args){
        int[] arr = {5,3,2,4,1};
        numberOfInversions(arr);
        System.out.println(count);
        for(int i=0; i<arr.length; i++){
            System.out.print(i+" ");
        }
    }
}
