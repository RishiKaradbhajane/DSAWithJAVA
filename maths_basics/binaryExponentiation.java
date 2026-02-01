package maths_basics;
public class binaryExponentiation{
    public static int findPower(int a, int b){
        if(b==0)  return 1;
        int half = findPower(a,b/2);
        int result = half*half;
        if(b%2==1) return a*result;
        return result;
    }
    public static void main(String[] args){
        System.out.println("a to the power b is :");
        System.out.println(findPower(2,4));
    }
}