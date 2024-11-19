package week11.work1;

public class ThrobController extends Thread{
    private ThrobPanel panel;
    private ThrobbingBall ball;
    private int delayTime;

    public ThrobController(ThrobPanel panel, ThrobbingBall ball, int delayTime) {
        this.panel = panel;
        this.ball = ball;
        this.delayTime = delayTime;
    }

    @Override
    public void run() {
        while (true) {
            ball.throb();
            panel.repaint();
            try {
                Thread.sleep(delayTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}