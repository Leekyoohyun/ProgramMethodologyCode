package java_final_1st.final_arrays.slidePuzzle;

public class SlidePuzzleBoard {
    private int number = 1;
    private PuzzlePiece[][] board;
    int empty_row, empty_col;

    public PuzzlePiece[][] contents() {
        return board;
    }

    public SlidePuzzleBoard(){
        board = new PuzzlePiece[4][4];
        number = 15;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                board[i][j] = new PuzzlePiece(number);
                number -= 1;
            }
        }
        board[3][3] = null;
        empty_row = 3;
        empty_col = 3;
    }

    public boolean move(int w){
        int row, col;
        if(found(w, empty_row-1, empty_col)){
            row = empty_row-1;
            col = empty_col;
        }
        else if(found(w, empty_row+1, empty_col)){
            row = empty_row+1;
            col = empty_col;
        }
        else if(found(w, empty_row, empty_col-1)){
            row = empty_row;
            col = empty_col-1;
        }
        else if (found(w, empty_row, empty_col+1)){
            row = empty_row;
            col = empty_col+1;
        }
        else{
            return false;
        }

        board[empty_row][empty_col] = board[row][col];
        board[row][col] = null;
        empty_row = row;
        empty_col = col;
        return true;
    }

    public boolean found(int v, int row, int col){
        if(row>=0 && row<=3 && col>=0 && col<=3){
            return board[row][col].faceValue() ==v;
        }
        else{
            return false;
        }
    }

}
