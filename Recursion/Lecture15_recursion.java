public class Lecture15_recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        int fact =1;
        if(n == 0){
            return 1;
        }
        factorial(n-1);
        fact = n * factorial(n-1);
        return fact;
    }

    public static int  sum(int n){
        int sum1=0;
        if(n==1){
            return 1;
        } 
        sum(n-1);
        sum1 = n + sum(n-1);
        return sum1;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        fibonacci(n-1);
        fibonacci(n-2);
        int fib= fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }

    public static boolean isSorted(int arr[],int i){
        if(arr[i]==arr.length){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted( arr, i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        
        if(isFound != -1){ 
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        
        return isFound;
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        // power(x,n-1);
        // int pow = x * power(x,n-1);
        // return pow;
         
       return x * power(x,n-1);
    }
    public static int optimizedPower(int a, int n){
        if(n==1){
            return a;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower *halfPower;

        //n is odd
        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static int tilingProblem(int n){ //2 x n (floor size)
       if(n==0 || n==1){
        return 1;
       }
        // kaam 
        //vertical choice
       int fnm1 = tilingProblem(n-1);
       
       // horizontal choice
       int fnm2 = tilingProblem(n-2);

       int totalWays = fnm1 + fnm2;
       return totalWays;
    }
    public static void  removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicates
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a']= true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    } 

public static void main(String[] args) {
        int n = 2;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(23)); 
        // int arr[] = {1,4,6,8,19,23,6,9};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 6, 0));
        // System.out.println(lastOccurence(arr, 6, 0));
        // System.out.println(power(2, 4));
        // System.out.println(optimizedPower(2, 10));
        //System.out.println(tilingProblem(4));
        String str = "appnnacollge";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
     
 