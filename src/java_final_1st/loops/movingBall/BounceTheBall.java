package java_final_1st.loops.movingBall;

import java.awt.*;

public class BounceTheBall {
    public static void main(String[] args) {
        //모델 객체 생성
        int box_size=200;
        int balls_radius = 6;
        Box box = new Box(box_size);

        //공을 상자의 적절한 위치에 두기
        MovingBall ball = new MovingBall((int)(box_size/3.0), (int)(box_size/5.0), balls_radius, box);
        BallWriter ball_writer = new BallWriter(ball, Color.red);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriter writer = new AnimationWriter(box_writer, ball_writer, box_size);

        //컨트롤러 객체 생성 후 애니메이션 시작
        new BounceController(ball, writer).runAnimation();
    }
}
