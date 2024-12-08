package java_final_2nd.counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterFrame extends JFrame implements ActionListener {
    private Counter count;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c){
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        JButton button = new JButton("OK");
        button.addActionListener(this);
        cp.add(button);
        setTitle("Counter");
        setSize(200, 60);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //버튼에 반응이 없다.
    public void actionPerformed(ActionEvent e) {
        count.increase();
        label.setText("count = " + count.countOf());
        //update(); 해줘야하나
    }

}
