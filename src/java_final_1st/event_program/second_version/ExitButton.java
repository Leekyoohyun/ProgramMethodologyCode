package java_final_1st.event_program.second_version;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {

    //버튼에 붙는 라벨
    public ExitButton(String label) {
        super(label);
        addActionListener(this);
    }

    //버튼 누리기 액션 이벤트 처리
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
