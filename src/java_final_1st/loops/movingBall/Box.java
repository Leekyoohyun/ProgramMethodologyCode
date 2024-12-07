package java_final_1st.loops.movingBall;

public class Box {
    private int BOX_SIZE;

    public Box(int size) {
        BOX_SIZE = size;
    }

    //공이 x 축 방향으로 좌/우 벽에 도달 여부를 리턴
    // x_position 공의 x 좌표
    // x좌표가 좌우 벽의 x 좌표와 같거나 벗어났으면 true. 그렇지 않으면 false
    public boolean inHorizontalContact(int x_position) {
        return (x_position <= 0) || ( x_position >= BOX_SIZE );
    }
    // 공이 y 축 방향으로 위/아래 벽에 도달 여부를 리턴
    // y_position 공의 y 좌표
    // 공의 x 좌표가 좌우 벽의 y 좌표와 같거나 작으면 true, 그렇지 않으면 false
    public boolean inVerticalContact(int yPos) {
        return ( yPos <= 0) || (yPos >= BOX_SIZE);
    }

    public int sizeOf(){
        return BOX_SIZE;
    }
}
