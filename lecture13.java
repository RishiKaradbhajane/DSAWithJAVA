public class lecture13 {
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask)==0){
            System.out.println("even number");
        }
        else
          System.out.println("odd number");
    }
    public static int getIntBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(i<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIBit(int n ,int i){
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }
    public static int clearUptoJBitsFromIBits(int n, int i, int j){
        int a = ((~0)<< j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
         return n & bitMask;

    }   
    
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static int setBitNumber(int n){
        int count = 0;
        while(n > 0){
           if((n & 1) != 0){
            count ++;
           }
           n = n>>1;
    }
    return count;
}
public static boolean isPowerofTwo(long n){
        
    // Your code here
    int temp=2;
    while(n!=0){
        if(2*temp==n){
            return true;
        }
        temp*=2;
    }
    return false;
}

    public static void main(String args[]){
        System.out.println((~0));
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(9);   
        System.out.println(getIntBit(15,2));
        System.out.println(setIthBit(6,2));
        System.out.println(clearIthBit(10,2));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIBit(10,2));
        System.out.println(clearUptoJBitsFromIBits(10, +2, 4));
        System.out.println(isPowerOfTwo(9));
        System.out.println(setBitNumber(7));
        System.out.println(isPowerOfTwo(16));
     }
}