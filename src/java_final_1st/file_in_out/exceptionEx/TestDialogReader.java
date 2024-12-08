package java_final_1st.file_in_out.exceptionEx;

import javax.swing.*;
import java.lang.ArithmeticException;

public class TestDialogReader {
    public static void main(String[] args) {
        int n = new DialogReader().readInt("정수 줘");
        try{
            String answer = "100 / "+ Integer.toString(n)+" = "+(100/n);
            JOptionPane.showMessageDialog(null, answer);
        }catch (ArithmeticException a){
            JOptionPane.showMessageDialog(null, a.getMessage()+"0 으로 못나눔");
        }
    }
}
