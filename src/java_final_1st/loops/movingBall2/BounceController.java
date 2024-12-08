package java_final_1st.loops.movingBall2;

public class BounceController {
    private MovingBall ball; //공 객체(model)
    private AnimationWriter writer; // 애니메이션 객체(view)

    public BounceController(MovingBall b, AnimationWriter w) {
        this.ball = b;
        this.writer = w;
    }

    public void runAnimation(){
        int time_unit = 1; // 애니메이션 스텝의 시간 단위
        int painting_delay = 20; //다시 그리기 사이 지연시간
        while(true){
            delay(painting_delay);
            ball.move(time_unit);
            writer.repaint();
        }
    }

    private void delay(int how_long){
        try{ Thread.sleep(how_long);}
        catch (InterruptedException e){}
    }
}
