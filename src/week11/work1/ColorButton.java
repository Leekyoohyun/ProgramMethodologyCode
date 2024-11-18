package week11.work1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButton extends JButton implements ActionListener {
    private ThrobPanel panel;

    public ColorButton(String label, ThrobPanel panel) {
        super(label);
        this.panel = panel;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.toggleColor();
        panel.repaint();
    }
}
