package java_final_1st.loops.movingBall2;

import javax.swing.*;
import java.awt.*;

public class AnimationWriters extends JPanel {
    private BoxWriter box_writer; // 상자 그리는 객체
    private BallWriters ball_writer_1; // 공 그리는 객체

    //상자와 공을 그리는 view 객체를 생성
    public AnimationWriters(BoxWriter b, BallWriters l1, int size){
        box_writer = b;
        ball_writer_1 = l1;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Bounce");
        f.setSize(size, size+22);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        box_writer.paintComponent(g);
        ball_writer_1.paintComponent(g);

    }
}
