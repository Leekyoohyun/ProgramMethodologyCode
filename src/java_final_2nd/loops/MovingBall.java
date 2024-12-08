package java_final_2nd.loops;

public class MovingBall {
    //MovingBall 2차원 상자에서 움직이는 공
    private int x_pos; //공 중심 x좌표
    private int y_pos; //공 중심 y좌표
    private int radius; //공 반지름

    private int x_velocity; //x축 이동 속도
    private int y_velocity; //y축 이동 속도

    private Box container;

    public MovingBall(int x_initial, int y_initial, int r,Box box) {
        x_pos = x_initial;
        y_pos = y_initial;
        radius = r;
        container = box;
    }

    public int xPosition() {
        return x_pos;
    }

    public int yPosition() {
        return y_pos;
    }

    public int radiusOf() {
        return radius;
    }

    public void move(int time_units){
        x_pos = x_pos+x_velocity*time_units;
        if(container.inHorizontalContact(x_pos))
            x_velocity = -x_velocity;
        y_pos = y_pos+y_velocity*time_units;
        if(container.inVerticalContact(y_pos))
            y_velocity = -y_velocity;
    }
}
