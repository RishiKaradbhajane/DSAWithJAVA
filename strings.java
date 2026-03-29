import java.util.*;
public class strings{

    public static void printlettes(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static boolean isPallindrome(String str){
        int n= str.length();
        for(int i=0; i<n/2;i++){
               if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
               }
        }
        return true;
    }
        
    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("XYZ");

        // //String is immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = " TOny Stark";
        // System.out.println(name.length());

        //concatenation
        String firstName = "Shraddha";
        String lastName = "khapra";
        String fullname2 =  firstName + " " +lastName;
        System.out.println(fullname2.charAt(4));
        String vehicle = new String("racecar");
        printlettes(fullname2);
        System.out.println(isPallindrome(vehicle));
        System.out.println("Try programiz.pro");
        Integer a = new Integer("30");
        System.out.println(a+30);
        int ab = a.intValue();
        System.out.println(ab);
        int d = 10;
        Integer d1 = Integer.valueOf(d);
        System.out.println(d1);
        String s = "90";
        long l = Long.parseLong(s);
        System.out.println(l);
        String s1 = "abc";
        final String s2 = "ab";
        final String s3 = "c";
        System.out.println(s1 == s2+s3);
        }
}