package java_final_1st.loops.movingBall2;

import java.awt.*;

public class BallWriters {
    //공을 그림
    private MovingBall ball1, ball2;
    private Color balls_color;

    public BallWriters(MovingBall x1, MovingBall x2, Color c) {
        this.ball1 = x1;
        this.ball2 = x2;
        this.balls_color = c;
    }

    //공그리기
    public void paintComponent(Graphics g){
        g.setColor(balls_color);
        int radius1 = ball1.radiusOf();
        int radius2 = ball2.radiusOf();
        g.fillOval(ball1.xPosition()-radius1, ball1.yPosition()-radius1, radius1*2, radius1*2);
        g.fillOval(ball2.xPosition()-radius1-20, ball2.yPosition()-radius1+5, radius1*2, radius1*2);
    }
}
