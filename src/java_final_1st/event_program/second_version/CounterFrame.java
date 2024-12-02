package java_final_1st.event_program.second_version;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame {
    private Counter counter;
    private JLabel label = new JLabel("press button");
    private Drawing panel;

    public CounterFrame(Counter c, Drawing p) {
        counter = c;
        panel = p;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(label);
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new CountButton("OK", counter, this));
        p2.add(new ExitButton("Exit"));
        cp.add(p1, BorderLayout.NORTH);
        cp.add(panel, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);
        setTitle("Counter");
        setSize(200, 280);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //update - 뷰 갱신
    public void update(){
        label.setText("count = "+counter.countOf());
        panel.repaint();
    }
}

