import java.util.Scanner;
public class stringDirection {
public static double getShortestPath(String path){
    int x = 0, y = 0 ;
    for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);
        if(dir=='S')
          y--;
        else if(dir == 'N')
          y++;
        else if(dir == 'W')
          x--;
        else
          x++;
        
        }
         float x2 =(float)x*x;
        float y2 =(float)y*y;
        return Math.sqrt(x2+y2);
}

    public static void main(String[] args) {
        System.out.println("enter the direction string");
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        System.out.println(getShortestPath(direction));

    }
}