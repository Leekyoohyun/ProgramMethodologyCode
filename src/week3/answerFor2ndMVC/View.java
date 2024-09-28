package week3.answerFor2ndMVC;

import javax.swing.*;
import java.time.LocalTime;

public class View {
    void show(LocalTime t){
        System.out.println(t); //그냥 show
    }

    // t 는 LocalTime 형..

    void showSwing(LocalTime t){
        JOptionPane.showMessageDialog(null, t);
    }   // GUI 이용
}
