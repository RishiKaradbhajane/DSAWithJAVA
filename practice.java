import java.util.*;

public class practice {

    public static int[] nextGreaterElement(int arr[], int n) {
        int[] arr2 = new int[n];
        n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    arr2[i] = arr[j];
                } else {
                    arr2[i] = -1;
                }
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :  ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(nextGreaterElement(arr, n));
    }
}