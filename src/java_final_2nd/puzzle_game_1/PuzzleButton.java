package java_final_2nd.puzzle_game_1;

import javax.swing.*;
import java.awt.event.*;
public class PuzzleButton extends JButton implements ActionListener {
    private SlidePuzzleBoard board;
    private PuzzleFrame frame;

    public PuzzleButton(SlidePuzzleBoard b, PuzzleFrame f) {
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = getText();
        if(! s.equals("") && board.move(Integer.parseInt(s))){
            frame.update();
        }
    }
}
