public class sudokuSolver {
    private static void solveSudoku(char[][] board){
        solve(board);
    }
    private static boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.'){
                    for(int c=1;c<=9;c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=(char)(c+'0');

                            if(solve(board)==true) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int row, int col, int c){
        int ch = (char)(c+'0');
        for(int i=0; i<board.length; i++){
            if(board[row][i]==ch) return false;
            if(board[i][col]==ch) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String[][] board1 = {{"5","3",".",".","7",".",".",".","."},
                 {"6",".",".","1","9","5",".",".","."},
                 {".","9","8",".",".",".",".","6","."},
                 {"8",".",".",".","6",".",".",".","3"},
                 {"4",".",".","8",".","3",".",".","1"},
                 {"7",".",".",".","2",".",".",".","6"},
                 {".","6",".",".",".",".","2","8","."},
                 {".",".",".","4","1","9",".",".","5"},
                 {".",".",".",".","8",".",".","7","9"}};
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = board1[i][j].charAt(0);
            }
        }
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            System.out.print("[");
            for (int j = 0; j < 9; j++){
                System.out.print(board[i][j]+",");
            }
            System.out.println("]");
        }
    }
}
