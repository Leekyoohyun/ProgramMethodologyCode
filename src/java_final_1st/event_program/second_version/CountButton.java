package java_final_1st.event_program.second_version;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountButton extends JButton implements ActionListener {
    CounterFrame view;
    Counter model;

    //CounterButton - 버튼 컨트롤러
    //label - 버튼에 붙는 라벨
    // m - 협조할 모델
    // v - 갱신할 뷰
    public CountButton(String label, Counter m, CounterFrame v){
        super(label);
        model = m;
        view = v;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        model.increment();
        view.update();
    }
}
