public class  spiralMatrix{

    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }
            // right
            for(int i=startRow+1;i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break; 
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i= endRow-1; i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
     
    public static  void diagonalSum(int matrix[][]){
        int sum =0;
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         if(i==j)
        //           sum = sum + matrix[i][j];
        //     }
        // }
        // for(int i=matrix.length-1;i>=0;i--){
        //     for(int j=matrix[0].length; j>=0;j--){
        //         if(i+j==matrix.length-1){
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);


       // optimized code for diagonal sum--
        for(int i=0;i<matrix.length;i++){
            //pd
            sum = sum + matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
              sum = sum + matrix[i][matrix.length-i-1];
            }
            System.out.println(sum);
        }

        public static boolean stairCaseSearch(int matrix[][], int key){
            int row =0, col = matrix[0].length-1;

            while(row<matrix.length  && col>=0){
                if(matrix[row][col] == key){
                    System.out.println("found key at ("+ row + ","+ col + ")");
                   return true;
                }
                else if(key <matrix[row][col]){
                    col--;
                }
                else{
                   row++; 
                }
            }
            System.out.println("key does not found at any place in matrix");
            return false;
        }
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 100;

        printSpiral(matrix);
        diagonalSum(matrix);
        stairCaseSearch(matrix, key);

    }
}