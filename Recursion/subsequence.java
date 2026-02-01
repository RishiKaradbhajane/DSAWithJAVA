import java.util.*;

public class subsequence {

    public static void sub(int ind, ArrayList<Integer> arr, int arr1[], int n) {
        if (ind >= n) {
            for (int i : arr)
                System.out.print(i+" ");
            if(arr.size()==0)
                System.out.print("{ }");
            System.out.println();
            return;    
        }
    
        // take or pickup the particular index into the subsequence
        arr.add(arr1[ind]);
        sub(ind + 1, arr, arr1, n);
        arr.removeLast();

        // not-take or not-pickup the particular index into the subsequence
        sub(ind + 1, arr, arr1, n);
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 1, 2 };
        int n = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        sub(0, arr, arr1, n);

    }
}