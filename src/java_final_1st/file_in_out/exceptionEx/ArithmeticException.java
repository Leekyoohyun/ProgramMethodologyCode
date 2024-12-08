package java_final_1st.file_in_out.exceptionEx;

import javax.swing.*;

public class ArithmeticException {
    public static void main(String[] args) {
        int n = readInt();
        try {
            String answer = 100 + " 나누기 " + Integer.toString(n) + " = " + (100 / n);
            JOptionPane.showMessageDialog(null, answer);
        } catch (java.lang.ArithmeticException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"0으로 나눌 수 없음");
            n = readInt();
        }
    }

    private static int readInt(){
        int n;
        String input = JOptionPane.showInputDialog("정수 줘라");
        try{
            n = Integer.parseInt(input.trim());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"정수가 아님.");
            n = readInt(); // 재시도
        }
        return n;
    }
}
