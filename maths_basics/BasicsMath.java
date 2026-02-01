package maths_basics;
import java.lang.*;

public class BasicsMath {

    public static int GCD(int a, int b){
        //euclidean algorithm for GCD
        System.out.print("\nGCD of above two number is ");
        while(a>0 && b>0){
            if(a>b) a = a%b;
            else    b = b%a;
            }
            if(a==0) return b;
            else return a;
    }

    public static boolean armstrongNumber(int n){
        long result = 0;
        int originalNum = n;
        while(n>0){
            int lastDigit = n%10;
            result += Math.pow(lastDigit,3);
            n /=10;
        }
        System.out.println(result);
        if(originalNum==result) return true;
        else return false;
    }
    public static void printAllDivisor(int n){
        System.out.println("All the divisors of number "+n+" are ");
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n%i!=1){
                    if(i!=n/i)
                       System.out.print((int)(n/i)+" ");
                }
            }
        }
    }

    public static void reverseNumAndCount(int num){
        int count = (int)(Math.log10(num)+1);
        System.out.println("Number of digits in a number using log method : "+count);
        int count2=0;
        System.out.println("Print all the digits in reverse Order");
        int rev = 0;
        while(num>0){
            int digit = num%10;
            System.out.print(digit+" ");
            count2++;
            num=num/10;
            rev = rev*10 + digit;
        }
        System.out.println("\nNumber of digits in a number is : "+count2);
        System.out.println("Reverse Number is "+rev);
    }
    public static void main(String[] args) {        
        reverseNumAndCount(6723453);
        System.out.println(armstrongNumber(371));
        printAllDivisor(36);
        System.out.println(GCD(52,10));
    }
}