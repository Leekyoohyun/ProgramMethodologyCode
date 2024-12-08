package java_final_2nd.puzzle_game_1;

import javax.swing.*;
import java.awt.*;

public class PuzzleFrame extends JFrame {
    private SlidePuzzleBoard board;
    private PuzzleButton[][] button_board;

    public PuzzleFrame(SlidePuzzleBoard b){
        board = b;
        button_board = new PuzzleButton[4][4];
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,4));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                button_board[i][j] = new PuzzleButton(board, this);
                cp.add(button_board[i][j]);
            }
        }
        update();
        setTitle("Slide Puzzle");
        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update(){
        PuzzlePiece pp;
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                pp = board.getPuzzlePiece(row, col);
                if(pp != null){
                    button_board[row][col].setText(Integer.toString(pp.getFace()));
                }else
                    button_board[row][col].setText((""));
            }
        }
    }
}
