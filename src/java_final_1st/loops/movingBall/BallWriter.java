package java_final_1st.loops.movingBall;

import java.awt.*;

public class BallWriter {
    //공을 그림
    private MovingBall ball;
    private Color balls_color;

    public BallWriter(MovingBall x, Color c) {
        this.ball = x;
        this.balls_color = c;
    }

    //공그리기
    public void paintComponent(Graphics g){
        g.setColor(balls_color);
        int radius = ball.radiusOf();
        g.fillOval(ball.xPosition()-radius, ball.yPosition()-radius, radius*2, radius*2);
    }
}
