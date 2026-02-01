import java.util.Scanner;
public class loops{
    public static void main(String args[]){
        int counter =0;
        while(counter<10){
        System.out.println("hello world");
        counter++;
    }
    int sum=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=0;
    while(i<=n){
        sum+=i;
        i++;
    }
    System.out.println(sum); 
    for(int j=1; j<5; j++){
        if(j==3){
            break;
        }
        System.out.println(j);
    }
    System.out.println("come out of the loop");
    
    // print reverse of the number
    //to print last digit num%10
    // remove last digit num/10
    System.out.println("enter numbe which is to be reversed");
    int m=sc.nextInt();
    while(m>0){
        int lastDigit = m %  10;
        System.out.print(lastDigit + " ");
        m = m / 10;
    }
     
}

}