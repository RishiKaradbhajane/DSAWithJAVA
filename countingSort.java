public interface countingSort {
    public static int[] sorting(int[] arr){

        int maxNum = Integer.MIN_VALUE;
        // Max Number
        for(int num : arr){
            maxNum = Math.max(maxNum, num);
        }
        // counting arr of length maxNum
        int[] cntArr = new int[maxNum+1];
        for(int i=0; i<arr.length; i++){
            cntArr[arr[i]]++;
        }
        // prefix sum
        for(int i=1; i<cntArr.length;i++){
            cntArr[i] += cntArr[i-1];
        }
        int[] ans = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            ans[cntArr[arr[i]]-1] = arr[i];
            cntArr[arr[i]]--;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,3,2,4,1};
        int[] ans = sorting(arr);
        System.out.println("array after sorting : ");
        for(int num : ans) System.out.print(num+" ");

    }
}
/*
Complexity Analysis of Counting Sort:
Time Complexity: O(N+M) in all cases, where N and M are the size of inputArray[] and countArray[] respectively.
Auxiliary Space: O(N+M), where N and M are the space taken by outputArray[] and countArray[] respectively.

Advantage, of Counting Sort:
Counting sort generally performs faster than all comparison-based sorting algorithms, such as merge sort and quicksort, if the range of input is of the order of the number of input.
Stable Algorithm

Disadvantage of Counting Sort:
Does not work on decimal values.
Inefficient if the range of values to be sorted is very large.
Not an In-place sorting algorithm, It uses extra space for sorting the array elements.

Applications of Counting Sort:
It is a commonly used algorithm for the cases where we have limited range items. For example, sort students by grades, sort a events by time, days, months, years, etc
It is used as a subroutine in Radix Sort
The idea of counting sort is used in Bucket Sort to divide elements into different buckets.

*/
