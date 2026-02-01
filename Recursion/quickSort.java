
public class quickSort {

    public static void quickSort(int arr[],int si,int ei){
       if(si<ei){
        int pIndex = partition(arr, si, ei);
        quickSort(arr, si, pIndex-1); // left side
        quickSort(arr, pIndex+1, ei); // right side
       }
    }
  
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[si];
        int low = si;
        int high = ei;
        while(low<high){
            while(arr[low]<=pivot && low <=ei-1){
                low++;
            }
            while(arr[high]>pivot && high >=si+1){
                high--;
            }
            if(low<high){
                int temp  = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }

        int temp = arr[si];
        arr[si] = arr[high];
        arr[high] = temp;   
        
        return high;
    }

public static void main(String[] args) {
    int arr[] = {6, 3, 9, 8, 2, 5,2};
    quickSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}