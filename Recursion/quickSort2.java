public class quickSort2 {
    public static void qs(int[] arr, int low, int high){
        if(low<high){
            int pIdex = partition(arr, low, high);
            qs(arr, low, pIdex-1);
            qs(arr, pIdex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<= high-1) i++;
            while(arr[j]> pivot && j>=low+1) j--;
            /*
            for descend order just need to change above while loops
            while(arr[i]>=pivot && i<= high-1) i++;
            while(arr[j]<pivot && j>=low+1) j--;
             */
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args){
        int[] arr = {1,2,54,7,2,4,6,2,36,71};
        qs(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+",");
        }
        
    }
}
