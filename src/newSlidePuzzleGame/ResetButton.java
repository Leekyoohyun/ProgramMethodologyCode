package newSlidePuzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton implements ActionListener {
    private SlidePuzzleBoard board;
    private PuzzleFrame frame;

    public ResetButton(SlidePuzzleBoard b, PuzzleFrame f) {
        super("Start");
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        board.createPuzzleBoard();
        frame.update();
    }
}
