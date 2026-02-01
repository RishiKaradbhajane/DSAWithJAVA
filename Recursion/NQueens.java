import java.util.*;
public class NQueens {

    private static boolean isSafe(int row, int col, char[][] board, int n){
        int duprow = row;
        int dupcol = col;
        while(row>=0 && col>=0){
            if(board[row--][col--]=='Q') return false;
        }
        row = duprow; col = dupcol;
        while(col>=0){
            if(board[row][col--]=='Q') return false;
        }
        row = duprow; col = dupcol;
        while(row<n && col>=0){
            if(board[row++][col--]=='Q') return false;
        }
        return true;
    }

    private static void solve(int col, char[][] board, List<List<String>> result, int n){
        if(col==n){
            ArrayList<String> ds = new ArrayList<>();
            for(int i=0; i<n;i++){
                ds.add(new String(board[i]));
            }
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int row=0; row<n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col]='Q';
                solve(col+1, board, result, n);
                board[row][col]='.';
            }
        }
    }

    private static List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }
        solve(0, board, result, n);
        return result;
    }

    public static void main(String[] args){
        int n = 8;
        List<List<String>> result = solveNQueens(n);
        System.out.println(result);
        System.out.println("Total solution for "+n+" queens problem is "+result.size());
        
    }
}
