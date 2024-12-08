package java_final_2nd.loops.version2;

public class Starter {
    public static void main(String[] args) {
        Box box = new Box(300);
        MovingBall ball = new MovingBall(150, 150, 20, box);
        ball.setVelocity(2, 3);
        new MovingBallFrame(ball);
    }
}
