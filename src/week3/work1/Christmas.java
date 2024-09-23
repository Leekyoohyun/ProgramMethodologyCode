package week3.work1;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Christmas {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2024,12,25);
        JOptionPane.showMessageDialog(null, "오늘은 "+today);

        int monthResult = Period.between(today, christmas).getMonths();
        int dayResult = Period.between(today, christmas).getDays();

        JOptionPane.showMessageDialog(null, "올해 크리스마스까지 "+monthResult+" 달하고"+dayResult+" 일 남았다!");

    }
}
