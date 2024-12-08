package java_final_1st.loops.movingBall2;

public class BounceControllers {
    private MovingBall ball1; //공 객체(model)
    private MovingBall ball2;
    private AnimationWriters writer; // 애니메이션 객체(view)

    public BounceControllers(MovingBall b1,MovingBall b2, AnimationWriters w) {
        this.ball1 = b1;
        this.ball2 = b2;
        this.writer = w;
    }

    public void runAnimation(){
        int time_unit = 1; // 애니메이션 스텝의 시간 단위
        int painting_delay = 20; //다시 그리기 사이 지연시간
        while(true){
            delay(painting_delay);
            ball1.move(time_unit);
            ball2.move(time_unit);
            writer.repaint();

            if(collision(ball1, ball2)) {
                System.out.println("충돌!");
                System.exit(1);
            }
            writer.repaint();
        }
    }

    private void delay(int how_long){
        try{ Thread.sleep(how_long);}
        catch (InterruptedException e){}
    }

    private boolean collision(MovingBall b1, MovingBall b2){
        double d = Math.sqrt(Math.pow(b1.xPosition()-b2.xPosition(),2)+Math.pow(b1.yPosition()-b2.yPosition(),2));
        //반지름 합
        int sum_r = b1.radiusOf()+b2.radiusOf();

        return d <= sum_r;
    }
}
