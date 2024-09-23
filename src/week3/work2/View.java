package week3.work2;

import javax.swing.*;
import java.time.Period;

public class View {
    void showResult(Period p){
        JOptionPane.showMessageDialog(null, "올해 크리스마스까지 "+p.getMonths()+" 달하고"+p.getDays()+" 일 남았다!");
    }
}
