package java_final_1st.event_program.puzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleButton extends JButton implements ActionListener {
    private SlidePuzzleBoard board;
    private PuzzleFrame frame;

    public PuzzleButton(SlidePuzzleBoard board, PuzzleFrame frame) {
        this.board = board;
        this.frame = frame;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = getText();
        if(! s.equals("") && board.move(Integer.parseInt(s)))
            frame.update();
    }
}
