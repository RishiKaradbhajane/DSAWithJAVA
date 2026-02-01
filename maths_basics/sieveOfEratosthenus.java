package maths_basics;
public class sieveOfEratosthenus{
    public static int[] sieve(int n) {
        // code here
        boolean[] isPrime = new boolean[n+1];

        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i<isPrime.length;i++){
            isPrime[i] = true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime[i] == true){
                for(int j=2; i*j<=n;j++){
                    isPrime[i*j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]==true) count++;
        }
        int[] result = new int[count];
        int j = 0;
        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]==true){
                result[j]=i;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println("Print all the Prime numbers upto "+n);
        int[] result = sieve(n);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}