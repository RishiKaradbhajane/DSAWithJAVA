import java.util.Scanner;
public class continue1{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                if(i % 10 == 0){
                    continue;
                }
                System.out.println(i);
            }

        }
    }