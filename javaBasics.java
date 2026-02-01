import java.util.Scanner;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        String in =sc.nextLine();
        System.out.println(in);
        System.out.println("true or false:");
        boolean var = sc.nextBoolean();
        System.out.println(var);
        System.out.println("Enter the values of a and b:");
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println("product:"+ a*b);
        System.out.println("enter the radius of circle:");
        float rad = sc.nextFloat();
        float area= 3.142f * rad * rad;
        System.out.println(area);
        //type casting
         }  
    
}