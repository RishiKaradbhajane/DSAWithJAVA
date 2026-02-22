package NeetCode150;
// Leetcode 36
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for(int i=0; i<n; i++){
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                char ch = board[r][c];
                if(ch =='.') continue;

                if(row[r].contains(ch)) {
                    return false;
                }
                row[r].add(ch);

                if(col[c].contains(ch)) {
                    return false;
                }
                col[c].add(ch);
                int idx = (r/3)*3 + c/3;
                if(box[idx].contains(ch)) {
                    return false;
                }
                box[idx].add(ch);
            }
        }
        return true;
    }
    public static void main(String[] args){
        ValidSudoku s = new ValidSudoku();
        char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};
        boolean b = s.isValidSudoku(board);
        System.out.println(b);
    }
}
