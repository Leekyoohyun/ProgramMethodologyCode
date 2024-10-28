package week8.second_project;

public class BounceController {
    private MovingBall ball1, ball2; //공 객체 (Model)
    private AnimationWriter writer; // 애니메이션 객체 (Output-view)

    /** Constructor BounceController 컨트롤러 초기화
     * @param b 공 객체 (Model)
     * @param w 애니메이션 객체 (Output-View) */
    public BounceController(MovingBall b1, MovingBall b2, AnimationWriter w) {
        ball1 = b1;
        ball2 = b2;
        writer = w;
    }
    /** runAnimation 내부 시계를 활용하여 애니메이션 구동 */
    public void runAnimation() {
        int time_unit = 1; // 애니메이션 스텝의 시간 단위
        int painting_delay = 20; // 다시 그리기 사이의 지연 시간 간격
        while (true) {
            delay(painting_delay);
            ball1.move(time_unit);
            ball2.move(time_unit);
            System.out.println(ball1.xPosition() + ", " + ball1.yPosition());
            System.out.println(ball2.xPosition() + ", " + ball2.yPosition());

            //충돌여부 확인
            if(collison(ball1,ball2)){
                System.out.println("두 공이 충돌함");
                System.exit(1);
            }

            writer.repaint();
        }
    }
    /** delay how_long millisecond 동안 실행 정지 */
    private void delay(int how_long) {
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }

    private boolean collison(MovingBall b1, MovingBall b2) {
        double d = Math.sqrt(Math.pow(b1.xPosition() - b2.xPosition(), 2) + Math.pow(b1.yPosition() - b2.yPosition(), 2));
        //반지름 합
        int sum_r = b1.radiusOf()+b2.radiusOf();

        return d <= sum_r;
    }
}
