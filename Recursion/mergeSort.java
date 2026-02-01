public class mergeSort {
    public static void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
                k++;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }
        while (left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args){
        int[] arr = {1,3,7,4,2,7,9,1,3,5};
        divide(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        for(int n : arr){
            System.out.print(n+",");
        }
        int a = 2147483640;
        int b = 2147483647;
        int mean = (a+b);
        System.out.println("\n"+mean);
    }
}
