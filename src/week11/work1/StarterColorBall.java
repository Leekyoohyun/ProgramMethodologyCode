package week11.work1;

public class StarterColorBall {
    public static void main(String[] args) {
        ThrobbingBall ball = new ThrobbingBall();
        ThrobPanel panel = new ThrobPanel(300, ball);
        ColorButton button = new ColorButton("OK", panel);
        new ThrobFrame(300, panel, button);

        ThrobController controller = new ThrobController(panel, ball, 500);
        controller.start();
    }
}
