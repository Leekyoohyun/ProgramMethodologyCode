package java_final_1st.file_in_out.exceptionEx;

import javax.swing.*;
import java.io.*;

public class DivideException {
    public static void main(String[] args) {
        int n = readInt();
        String answer = 100+" 나누기 "+Integer.toString(n)+" = "+(100/n);
        JOptionPane.showMessageDialog(null, answer);
    }

    private static int readInt(){
        String input = JOptionPane.showInputDialog("정수 줘라");
        int n = Integer.parseInt(input.trim());
        return n;
    }
}
