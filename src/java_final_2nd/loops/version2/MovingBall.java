package java_final_2nd.loops.version2;

public class MovingBall {
    private int x_pos;
    private int y_pos;
    private int radius;
    private int x_velocity;
    private int y_velocity;
    Box container;

    public MovingBall(int x_initial, int y_initial, int r, Box box) {
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

    public void setVelocity(int x_vel, int y_vel) {
        x_velocity = x_vel;
        y_velocity = y_vel;
    }

    public void move(int time_units) {
        x_pos += x_velocity * time_units;
        if (container.inHorizontalContact(x_pos)) {
            x_velocity = -x_velocity;
        }
        y_pos += y_velocity * time_units;
        if (container.inVerticalContact(y_pos)) {
            y_velocity = -y_velocity;
        }
    }
}