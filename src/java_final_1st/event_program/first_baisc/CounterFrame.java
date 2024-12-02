package java_final_1st.event_program.first_baisc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame implements ActionListener {
    private Counter count;
    private JLabel label = new JLabel("카운트를 시작하려면 버튼을 누르세요");

    public CounterFrame(Counter c){
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        JButton button = new JButton("OK"); //버튼 만들기
        cp.add(button);
        button.addActionListener(this);// ??
        setTitle("Counter");
        setSize(400,60);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        count.increment();
        label.setText("count = "+count.countOf());
    }
}

