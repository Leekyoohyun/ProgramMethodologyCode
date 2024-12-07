package java_final_1st.event_program.count_review;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame implements ActionListener {
    private Counter count;
    private JLabel label = new JLabel("count = 0");
    private ExitButton exitButton = new ExitButton("Exit");

    public CounterFrame(Counter c){
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        JButton button = new JButton("OK");
        cp.add(button);
        button.addActionListener(this);
        setTitle("Counter");
        setSize(400,60);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(exitButton);


    }

    //버튼 이벤트 액션 처리
    public void actionPerformed(ActionEvent e){
        count.increment();
        label.setText("count = "+count.countOf());
    }
}
