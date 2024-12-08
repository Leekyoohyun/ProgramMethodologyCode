package java_final_2nd.loops.version2;

import javax.swing.*;
import java.awt.*;

public class MovingBallPanel extends JPanel {
    private MovingBall ball;

    public MovingBallPanel(MovingBall ball) {
        this.ball = ball;
        setPreferredSize(new Dimension(ball.container.sizeOf(), ball.container.sizeOf()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(ball.xPosition() - ball.radiusOf(), ball.yPosition() - ball.radiusOf(), ball.radiusOf() * 2, ball.radiusOf() * 2);
    }

    public void update() {
        ball.move(1);
        repaint();
    }
}