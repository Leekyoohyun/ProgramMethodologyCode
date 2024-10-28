package week8.second_project;

import javax.swing.*;
import java.awt.*;

public class BounceTwoBalls {
    public static void main(String[] args) {
        // 모델 객체 생성
        int box_size = 200;
        int balls_radius = 6;
        Box box = new Box(box_size);

        String message1 = "첫 번째 공의 x축 속도를 입력하시오.";
        String in_x1 = JOptionPane.showInputDialog(null, message1);
        String message2 = "첫 번째 공의 y축 속도를 입력하시오.";
        String in_y1 = JOptionPane.showInputDialog(null, message2);
        String message3 = "두 번째 공의 x축 속도를 입력하시오.";
        String in_x2 = JOptionPane.showInputDialog(null, message3);
        String message4 = "첫 번째 공의 x축 속도를 입력하시오.";
        String in_y2 = JOptionPane.showInputDialog(null, message4);
        int x_velocity1 = Integer.parseInt(in_x1);
        int y_velocity1 = Integer.parseInt(in_y1);
        int x_velocity2 = Integer.parseInt(in_x2);
        int y_velocity2 = Integer.parseInt(in_y2);
        MovingBall ball1 = new MovingBall((int)(box_size/4.0), (int)(box_size/2.0),balls_radius,box,x_velocity1,y_velocity1);
        MovingBall ball2 = new MovingBall((int)(box_size/3.0), (int)(box_size/5.0),balls_radius,box,x_velocity2,y_velocity2);

        BallWriter ball_writer = new BallWriter(ball1, Color.red, ball2, Color.blue);

        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriter writer = new AnimationWriter(box_writer,ball_writer,box_size);
        //컨트롤러 객체를 생성하고 애니메이션 시작
        new BounceController(ball1,ball2, writer).runAnimation();
    }
}
