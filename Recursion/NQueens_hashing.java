import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens_hashing {

    private static void solve(int col, char[][] board, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, List<List<String>> result, int n){
        if(col == n){
            ArrayList<String> ds = new ArrayList<>();
            for(int i=0; i< n; i++){
                ds.add(new String(board[i]));
            }
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int row = 0; row<n; row++){
            if(leftRow[row] ==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                board[row][col] = 'Q';
                leftRow[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1, board, leftRow, upperDiagonal, lowerDiagonal, result, n);
                board[row][col] = '.';
                leftRow[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }

    private static List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];
        solve(0, board, leftRow, upperDiagonal, lowerDiagonal,result, n);
        return result;
    }

    public static void main(String[] args){
        int n = 6;
        List<List<String>> result = solveNQueens(n);
        System.out.println(result);
        System.out.println("Total solution for "+n+" queens problem is "+result.size());
        
    }
}
