public class ArrayList2 {

    public static void containerWithMostWater(int[] height, int n) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = j - i;
                int h = Math.min(height[i], height[j]);
                max = Math.max(max, water * h);
            }
        }
        System.out.println("Maximum water that can be filled in a container is :" + max);

        // O(N)
        int left = 0;
        int right = height.length - 1;
        while(left<right){
            int water = (right - left);
            int h = Math.min(height[left], height[right]);
            max = Math.max(max,water*(h));

            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Maximum water that can be filled in a container is :" + max);
    }

    public static void pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            if (arr[left] + arr[right]== target)
                count++;
            if(arr[left]+arr[right]<target)
                left++;
            else
                right--;
            System.out.println(count);
        }
        System.out.println("Maximum number of pair of sum is : " + count);
    }
    public static void pairSum2(int[] arr,int target){
        int pivot=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
                break;
            }
        }
        int left = pivot+1;
        int right = pivot;
        int count = 0;
        int n = arr.length;
        while(left!=right){
            if (arr[left] + arr[right]== target)
                count++;
            if(arr[left]+arr[right]<target)
                left = (left+1)%n;
            else
                right = (n+right-1)%n;
        
        System.out.println(count);
    }
    System.out.println("Maximum number of pair of sum is : " + count);
    }

    public static void main(String[] args) {
        containerWithMostWater(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }, 9);
        pairSum(new int[]{1,2,3,4,5,6}, 5);
        pairSum2(new int[]{11,15,6,8,9,10}, 16);
    }
}