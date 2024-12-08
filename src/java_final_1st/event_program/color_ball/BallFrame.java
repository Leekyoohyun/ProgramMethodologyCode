package java_final_1st.event_program.color_ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallFrame extends JFrame {
    Ball ball = new Ball(0);
    private JLabel label = new JLabel();
    private ColorButton button = new ColorButton("OK");
    private BallPanel panel = new BallPanel();

    public BallFrame(Ball b){
        ball = b;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.add(button);
        cp.add(panel);
        setTitle("Ball");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
