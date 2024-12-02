package java_final_1st.event_program.second_version;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener {
    CounterFrame view;
    Counter model;

    CounterController(Counter m, CounterFrame v){
        view = v;
        model = m;
    }

    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }
}
