package week11.work1;

import javax.swing.*;
import java.awt.*;

public class ThrobFrame extends JFrame {
    public ThrobFrame(int size, ThrobPanel panel, ColorButton button) {
        setTitle("Throb");
        setSize(size, size + 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(panel, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);
        setVisible(true);
    }
}
