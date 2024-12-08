package java_final_1st.loops.movingBall2;

import java.awt.*;

public class BoxWriter {
    private Box box;

    public BoxWriter(Box b){
        box = b;
    }

    public void paintComponent(Graphics g){
        int size = box.sizeOf();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, size, size);
        g.setColor(Color.WHITE);
        g.drawRect(0, 0, size, size);
    }
}
