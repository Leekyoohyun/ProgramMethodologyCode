package week6.bank;

import java.awt.*;
import javax.swing.*;

public class BankWriter extends JPanel {
    private int WIDTH = 300;
    private int HEIGHT = 200;
    private BankAccount bank;
    private String last_transaction = "";

    /* BankWriter - 출력기 초기화
    * @param title - 창의 제목
    * @param b - BankAccount 객체 */
    public BankWriter(String title, BankAccount b){
        bank =b;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle(title);
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT+22);
        g.setColor(Color.BLACK);
        int text_margin = 50;
        int text_baseline = 50;
        g.drawString(last_transaction, text_margin, text_baseline);
        g.drawString("잔액 = "+bank.getBalance()+"원",text_margin,text_baseline+20);
    }

    /* show Transaction - 거래 결과표시
    * @param message - 거래 메시지
    * @param amount - 거래금액
     */
    public void showTransaction(int amount, String message){
        last_transaction = amount + " 원"+message;
        this.repaint();
    }

    /* showTransaction - 거래 결과표시
    * @param message - 거래 메시지
     */
    public void showTransaction(String message){
        last_transaction = message;
        this.repaint();
    }
}
