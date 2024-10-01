package week4.writeOnCanvas;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas");
        frame.setSize(700,500);
        frame.getContentPane().add(this); //객체 자신을 가리키는 이름
        frame.setVisible(true); //프레임을 화면에 보이도록 설정합니다. 이 코드가 호출되지 않으면 GUI 창이 보이지 않습니다.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.drawString("HEY",100,60);
        g.setColor(Color.blue);
        g.drawString("Jude",200,60);
    }

    public static void main(String[] args) {
        new Canvas();
    }
}
