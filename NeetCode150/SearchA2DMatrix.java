package NeetCode150;

// LEETCODE  74

public class SearchA2DMatrix {
    // APPROACH 1
    // TC = O(N*M)
    // SC = O(1)
    public static boolean searchMatrix1(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    // APPROACH 2
    // TC = O(log(M*N))
    // SC = O(1)
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // The only change is here in below line
            int midValue = matrix[mid / n][mid % n];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean flag = searchMatrix2(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3);
        if (flag == true) {
            System.out.println("The target value is the part of the array");
        } else {
            System.out.println("The target value is not part of the array");
        }
    }
}
