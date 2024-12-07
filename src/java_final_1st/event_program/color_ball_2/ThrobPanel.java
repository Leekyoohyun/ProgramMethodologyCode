package java_final_1st.event_program.color_ball_2;

import javax.swing.*;
import java.awt.*;

public class ThrobPanel extends JPanel {
    private int panelSize;
    private Color color = Color.RED;
    private ThrobbingBall ball;

    public ThrobPanel(int size, ThrobbingBall ball) {
        this.panelSize = size;
        this.ball = ball;
    }

    public void toggleColor(){
        color = (color == Color.RED) ? Color.BLUE : Color.RED;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);

        //공의 크기
        int ballSize = ball.isLarge() ? 100:50;

        //공이 패털 가운데 위치하도록 좌표 계산
        int x = (panelSize - ballSize) / 2;
        int y = (panelSize - ballSize) / 2;

        //공 그리기
        g.fillOval(x, y, ballSize, ballSize);
    }
}
