package week11.work2;

import java.awt.event.*;
import javax.swing.*;

public class ResetButton extends JButton implements ActionListener {
    private SlidePuzzleBoard board;
    private PuzzleFrame frame;

    public ResetButton(SlidePuzzleBoard b, PuzzleFrame f) {
        super("Reset");
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        board.createPuzzleBoard();
        frame.update();
    }
}
