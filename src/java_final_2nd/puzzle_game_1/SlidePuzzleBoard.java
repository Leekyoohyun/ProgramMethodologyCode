package java_final_2nd.puzzle_game_1;

import java.util.Arrays;

public class SlidePuzzleBoard {
    private PuzzlePiece[][] board;

    private int empty_row;
    private int empty_col;

    public SlidePuzzleBoard(){
        board = new PuzzlePiece[4][4];
        int number = 15;
        for(int row=0; row < 4; row++){
            for(int col=0; col < 4; col++){
                board[row][col] = new PuzzlePiece(number);
                number -=1;
            }
        }
        board[3][3] = null;
        empty_col = 3;
        empty_row = 3;
    }

    public PuzzlePiece getPuzzlePiece(int row, int col){
        return board[row][col];
    }

    public boolean move(int w){
        int row, col;
        if(found(w, empty_row-1, empty_col)){
            row = empty_row-1;
            col = empty_col;
        }else if(found(w, empty_row+1, empty_col)){
            row = empty_row+1;
            col = empty_col;
        } else if (found(w, empty_row, empty_col-1)) {
            row = empty_row;
            col = empty_col-1;
        }else if(found(w, empty_row, empty_col+1)){
            row = empty_row;
            col = empty_col+1;
        }else
            return false;

        board[empty_row][empty_col] = board[row][col];
        row = empty_row;
        col = empty_col;
        board[empty_row][empty_col] = null;
        return true;
    }

    public boolean found(int v, int row, int col){
        if(row >= 0 && row <= 3 && col >= 0 && col <= 3){
            return board[row][col].getFace() == v;
        }
        else{
            return false;
        }
    }

}
