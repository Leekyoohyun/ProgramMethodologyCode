package java_final_1st.file_in_out.exceptionEx;

import javax.swing.*;

public class DialogReader {
    public String readString(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public int readInt(String prompt){
        int n;
        String input = readString(prompt);
        try{
            n = Integer.parseInt(input.trim());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"정수X");
            n = readInt(prompt);
        }
        return n;
    }

    public double readDouble(String prompt){
        double n;
        String input = readString(prompt);
        try{
            n = Double.parseDouble(input.trim());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"실수 X");
            n = readDouble(prompt); //재시도
        }
        return n;
    }
}
