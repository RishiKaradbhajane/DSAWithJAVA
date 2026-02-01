import java.net.SocketPermission;

public class Patterns{
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            // cells(i,j)
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print  (" ");
                }
            }
            System.out.println();
        }
    }
    // inverted rotateed half pyramid
    public static void inRoHalfPyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
    } 
    public static void pyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          
    } 
    public static void invertedHalfNumberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j+" ");
    
            }
            System.out.println();
        }
    }
    public static void floydsTriangle(int n){ 
        int counter=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void binaryTriangle(int n){
// here in this code we apply a logic using matircs
// places where sum of rownumber and columnnumber is even we will print 1 there
// and 0 at places where sum is odd
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                } else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
public static void butterflyPattern(int n){
    for(int i=1;i<=n; i++){
        for(int j=1;j<=i;i++){
            System.out.print("*");
            System.out.println();
        }
    }
}
public static void  solidRhombus(int n){
    for(int i=1; i<=n; i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(  int j=1; j<=n; j++){
            System.out.print("*");
        }
         System.out.println();
    }
}
public static void holloW_rhombus(int n){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //hollow rhombus
        for(int j=1; j<=n; j++){
            if(i == 1 || i == n ||j==1 || j==n){
                System.out.print("*"+"");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void diamond(int n){
     for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
          }
           for(int i=n-1; i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          
          
}

    public static void main(String args[ ]){
        pyramid(4);
        //hollowRectangle
        //invertedHalfNumberPyramid(7);
        floydsTriangle(6);
        binaryTriangle(5);
        solidRhombus(7);
       holloW_rhombus(6);
        diamond(5);
    }
}