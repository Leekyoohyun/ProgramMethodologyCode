package week8.second_project;

import java.awt.*;

public class BallWriter {
    private MovingBall ball1,ball2; // 공 객체
    private Color balls_color1, balls_color2; // 공의 색깔
    /** Constructor BallWriter **/
    public BallWriter(MovingBall b1, Color c1, MovingBall b2,Color c2) {
        ball1 = b1;
        balls_color1 = c1;
        ball2 = b2;
        balls_color2 = c2;
    }
    /** paint 공 그리기
     * @param g 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        g.setColor(balls_color1);
        int radius1 = ball1.radiusOf();
        g.fillOval(ball1.xPosition() - radius1, ball1.yPosition() - radius1,
                radius1 * 2, radius1 * 2);
        g.setColor(balls_color2);
        int radius2 = ball2.radiusOf();
        g.fillOval(ball2.xPosition()-radius2, ball2.yPosition()-radius2, radius2*2, radius2*2);
    }
}
