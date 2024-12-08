package java_final_2nd.slide_puzzle;

public class SlidePuzzleBoard {
    PuzzlePiece[][] board;
    int empty_row;
    int empty_col;

    public SlidePuzzleBoard(){
        board = new PuzzlePiece[4][4];
        int number = 15;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = new PuzzlePiece(number);
                number -= 1;
            }
        }
        // set the last piece to be the empty piece
        empty_col = 3;
        empty_row = 3;
        board[empty_row][empty_col] = null;
    }

    public boolean move(int w){
        return true;
    }

    public boolean found(int v){
        return true;

    }
}
