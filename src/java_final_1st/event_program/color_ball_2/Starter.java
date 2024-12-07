package java_final_1st.event_program.color_ball_2;

public class Starter {
    public static void main(String[] args) {
        ThrobbingBall ball = new ThrobbingBall();
        ThrobPanel panel = new ThrobPanel(300,ball);
        ColorButton button = new ColorButton("OK", panel);
        new ThrobFrame(300, panel, button);

        ThrobController controller = new ThrobController(panel, ball, 0);
        controller.start();
    }
}
