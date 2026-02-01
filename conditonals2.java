 import java.util.Scanner;
public class conditonals2{
    public static void main(String args[]){
        // largest number among three
        int a = 14;
        int b = 15;
        int  c =16;
        if(a>b && a>c){
            System.out.println("a is largest amongst all");
        }
        else if(b>c && b>a){
            System.out.println("b is largest amongst all");
        }
        else {
            System.out.println("c i largest amongst all");
        }
        //odd and even number
        Scanner sc = new Scanner(System.in);
        int  num =sc.nextInt();

        if(num % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        // imcome tax ca,
        int income = sc.nextInt();
        float tax=0;
        if(income <500000){
            tax =0;
        }
        else if(income >= 500000 && income <1000000){
            tax = income*0.2f;
        }
        else if(income >=1000000){
            tax = (int) (income * 0.3);
        }
        else{
            System.out.println("enter the valid income figure");
        }
        System.out.println("Your tax is : "+ tax);
    }
}