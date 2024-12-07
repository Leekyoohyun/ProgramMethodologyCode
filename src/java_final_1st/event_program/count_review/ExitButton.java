package java_final_1st.event_program.count_review;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {
    //버튼에 붙는 라벨
    public ExitButton(String label) {
        super(label);
        addActionListener(this);
    }

    //버튼 누르기 액션 이벤트 처리
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.exit(0);
    }
}
