import java.util.Scanner;
//1
public class methods{
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world"); 
        System.out.println("hello world");
        return;
    }
//2 sum of two input numbers
    public static int calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : "+ sum);
        return sum;
    }
//3 swap of numbers
    public static void swap(int a, int b){
        int temp=a;
        a=b; 
        b=temp; 
    }
//4 multiplt two numbers
    public static int multiply(int a,int b){
        int mul;
        mul=a*b;
        return mul;
    }
//5 binomial coefficient
    public static float binCoff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        float nCr = n_fact/(r_fact * nmr_fact);
        System.out.println(nCr);
        return nCr;
    }
//6 factorial of a number
    public static int factorial(int n){
        int fact = 1;

        for(int i=1;i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    // fumction overloading depends on parameter not on return type
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    } 
//7 to check prime number 
    public static boolean isPrime(int n){
        // corner cases
        boolean isPrime=true;
        if(n==2)
            return isPrime;
         for(int i=2; i<=n-1;i++){
             if(n%i==0){
                isPrime=false;
                break;
             }
        }
        return isPrime;
    }
//8 optimiseedd code to check prime number
    public static boolean opPrime(int n){
        if(n==2)
            return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
//9 range of prime numbers
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
//10 binary to decimal conversion
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum /10;
        }
        System.out.println("decimal of "+myNum+"="+ decNum);
    } 
//11 decimal to binary conversion
    public static void decToBin(int decNum){
        int pow=0;
        int rem=0;
        int binNum =0;
        while(decNum>0){
            rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow ++;
            decNum = decNum / 2;
        }
        System.out.println("binary of"+ decNum +" = "+binNum);
    }

    public static void main(String [] args){
        primeInRange(30);
        binToDec(1001);
        decToBin(4);

   }
} 