public class recursionBasic {

    public static void printNNumnber(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNNumnber(n - 1);
    }

    public static int printSum(int n) {
        if (n == 0)
            return 0;
        return n + printSum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void reverseArray(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr, l + 1, r - 1);
    }

    public static void reverseArrayUsingSingleVariable(int[] arr, int i) {
        if (i >= arr.length - i - 1)
            return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArrayUsingSingleVariable(arr, i + 1);
    }

    public static boolean checkPallindromeUsingRecursion(String str, int i) {
        if (i >= str.length() / 2)
            return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return checkPallindromeUsingRecursion(str, i + 1);
    }

    public static int NthFibonacciNumberUsingRecursion(int n){
        if(n<=1) return n;
        return NthFibonacciNumberUsingRecursion(n-1)+NthFibonacciNumberUsingRecursion(n-2);
    }

    public static int NthFibonacci(int n){
        if(n<=1) return n;
        int fib1 = 0, fib2 = 1;
        for(int i = 2; i<=n; i++){
            int temp = fib1+fib2;
            fib1 = fib2;
            fib2 =temp;
        }
        return fib2;
    }

    public static void main(String[] args) {
        printNNumnber(5);
        System.out.println("\nSum of first 5 natural numbers: " + printSum(5));
        System.out.println("\n Factorial of a number is " + factorial(4));
        int[] arr = { 1, 3, 4, 5, 6, 7 };
        reverseArray(arr, 0, 5);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("");
        reverseArrayUsingSingleVariable(arr, 0);
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\n" + checkPallindromeUsingRecursion("MADSM", 0));
        System.out.println("Nth fibonacci number is "+NthFibonacciNumberUsingRecursion(6));
        System.out.println("Nth fibonacci number without recursion is : "+NthFibonacci(6));

    }
}