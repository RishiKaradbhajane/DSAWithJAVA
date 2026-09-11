/*
Space Complexity: O(1)
Time Complexity : O(n log n) (for all cases)
Heap Sort = Build Heap + Extract Maximum repeatedly → O(n log n)
easy way to remember
Heap Sort = Build Heap → Take Maximum → Put at End → Heapify → Repeat
For ascending order: Use a Max Heap.
For descending order: Use a Min Heap.
Array formulas:
    1) Left child = 2i + 1
    2) Right child = 2i + 2
    3) Parent = (i - 1) / 2
*/

public class heapSortAlgorithm {
    public void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    public void heapsort(int[] arr){
        int n = arr.length;
        for(int i= n / 2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i=n-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args){
        int[] arr = {97,63,85,93,23,76,12,36};
        heapSortAlgorithm obj = new heapSortAlgorithm();
        obj.heapsort(arr);
        System.out.println("Array after sorting is :");
        for(int n : arr){
            System.out.print(n+",");
        }
    }
}
