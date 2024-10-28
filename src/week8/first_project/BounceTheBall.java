package week8.first_project;

import javax.swing.*;
import java.awt.*;

public class BounceTheBall {
    public static void main(String[] args) {
        // 모델 객체 생성
        int box_size = 200;
        int balls_radius = 6;
        Box box = new Box(box_size);
        String message = "x축과 y축 속도를 입력하시오.";
        String in_x = JOptionPane.showInputDialog(null, message);
        String in_y = JOptionPane.showInputDialog(null, message);
        int x_velocity = Integer.parseInt(in_x);
        int y_velocity = Integer.parseInt(in_y);
        MovingBall ball = new MovingBall((int)(box_size/3.0), (int)(box_size/5.0),balls_radius,box,x_velocity,y_velocity);

        BallWriter ball_writer = new BallWriter(ball, Color.red);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriter writer = new AnimationWriter(box_writer,ball_writer,box_size);
        //컨트롤러 객체를 생성하고 애니메이션 시작
        new BounceController(ball, writer).runAnimation();
    }
}
