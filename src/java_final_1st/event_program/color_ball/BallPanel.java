package java_final_1st.event_program.color_ball;

import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel {
    private int size = 0;
    private Color color;

    Ball b = new Ball(size);

    public void paintComponent(java.awt.Graphics g){
        g.drawOval(200,200,size,size);
        g.setColor(color);
    }

    public void increment(){
        size+=10;
    }

    public void changeColor(){
        color = Color.red;
    }
}
