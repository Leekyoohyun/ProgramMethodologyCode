package final_2021_1.problem1_2;

import javax.swing.*;

public class Reader {
    public String readMenu(String message){
        String input = JOptionPane.showInputDialog(message);
        while(! (input.equals("+") || input.equals("-")))
            input = JOptionPane.showInputDialog(message);
        return input;
    }

    public int readInteger(String message){
        String input = JOptionPane.showInputDialog(message);
        int n = Integer.parseInt(input);
        return n;
    }

    public double readDouble(String message){
        String input = JOptionPane.showInputDialog(message);
        double r = Double.parseDouble(input);
        return r;
    }
}
