import java.util.Scanner;
public class ternaryOperator{
    public static void main(String args[]){
        int number = 4;
        String type = (number%2 == 0) ? "even" : "odd";
        System.out.println(type);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks= sc.nextInt();
        String  progress = (marks>=  33)? "PASS" : "FAIL";
        System.out.println(progress);
    }
}