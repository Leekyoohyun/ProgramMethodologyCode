package week3.work1;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DayCalc {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2024,12,25);
        String in = JOptionPane.showInputDialog(null);

        int monthResult = Period.between(today, christmas).getMonths();
        int dayResult = Period.between(today, christmas).getDays();

        System.out.println(monthResult+dayResult);

        //String out = JOptionPane.showMessageDialog(null, "올해 크리스마스까지 "+monthResult+" 달하고"+dayResult+" 일 남았다!");

    }
}
