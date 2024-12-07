package java_final_1st.event_program.color_ball_2;

import javax.swing.*;
import java.awt.*;


public class ThrobFrame extends JFrame {
    public ThrobFrame(int size, ThrobPanel panel, ColorButton button) {
        setTitle("Throb");
        setSize(size, size);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(panel, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);
        setVisible(true);

    }
}
