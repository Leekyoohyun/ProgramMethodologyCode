package java_final_1st.event_program.color_ball;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ColorButton extends JButton implements ActionListener {
    JLabel label = new JLabel();
    BallPanel ball = new BallPanel();


    public ColorButton(String label) {
        super(label);
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        ball.increment();
        ball.changeColor();
    }
}
