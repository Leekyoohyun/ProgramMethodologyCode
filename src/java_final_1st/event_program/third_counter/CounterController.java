package java_final_1st.event_program.third_counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener {
    private Counter model;
    private CounterFrame view;

    public CounterController(Counter m, CounterFrame v){
        model = m;
        view = v;
    }

    public void actionPerformed(ActionEvent e){
        view.ubdate();
    }
}
