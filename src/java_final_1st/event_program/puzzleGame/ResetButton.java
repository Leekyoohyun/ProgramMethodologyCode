package java_final_1st.event_program.puzzleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton implements ActionListener {
    PuzzleFrame frame = new PuzzleFrame(new SlidePuzzleBoard());
    public ResetButton() {
        JButton button = new JButton("Reset");
    }

    public void actionPerformed(ActionEvent e) {
        frame.update();
    }
}
