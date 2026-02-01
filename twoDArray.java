import java.util.*;
public class twoDArray{
    public static boolean search(int marks[][],int key){
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[0].length; j++){
                if(marks[i][j]==key){
                    System.out.println("element found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false; 

    }
    public static void main(String args[]){
        int marks[][] = new int [3][3];
        int n=marks.length, m = marks[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                marks[i][j] = sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
      for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(marks[i][j]+ " ");
                if(marks[i][j]> max){
                    max = marks[i][j];
                }
                if(marks[i][j]< min){
                    min = marks[i][j];
                }
            }
            System.out.println();
        } 
        System.out.println("largest among all element is "+ max);
        System.out.println("smallest among all element is "+ min);
        search(marks, 5);

    }
}