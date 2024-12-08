package java_final_2nd.loops.version2;

import javax.swing.*;

public class MovingBallFrame extends JFrame {
    private MovingBallPanel ballPanel;

    public MovingBallFrame(MovingBall ball) {
        ballPanel = new MovingBallPanel(ball);
        add(ballPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Timer timer = new Timer(30, e -> ballPanel.update());
        timer.start();
    }

    public static void main(String[] args) {
        Box box = new Box(300);
        MovingBall ball = new MovingBall(150, 150, 20, box);
        ball.setVelocity(2, 3);
        new MovingBallFrame(ball);
    }
}