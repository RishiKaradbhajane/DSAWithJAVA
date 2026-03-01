package BitManipulation;

public class Lec01_tuf {
    // Function to convert into binary from decimal
    // TC = O(logN)  SC = O(logN)
    public static String toBinary(int n){
        StringBuilder binary = new StringBuilder("");
        while(n>0){
            if(n%2 == 1) binary.append(1);
            else binary.append(0);
            n /= 2;
        }
        String res = binary.reverse().toString();
        return res;
    }
    // Function to convert into decimal from binary
    // TC = O(n) SC =O(1)
    public static int toDecimal(String str){
        int res = 0;
        int pow = 1;
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch=='1') res += pow;
            pow =pow *2;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println("Converting number to binary from decimal : " + toBinary(7));
        System.out.println("Converting number to Decimal from Binary : " + toDecimal("111"));
    }
}
