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
