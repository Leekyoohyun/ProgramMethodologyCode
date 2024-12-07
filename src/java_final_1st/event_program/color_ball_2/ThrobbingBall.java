package java_final_1st.event_program.color_ball_2;

public class ThrobbingBall {
    private boolean isLarge = false;

    public boolean isLarge() {
        return isLarge;
    }

    public void throb(){
        isLarge = !isLarge;
    }
}


