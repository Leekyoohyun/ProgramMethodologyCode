package java_final_1st.event_program.second_version;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    private Counter counter;

    public Drawing(Counter c) {
        counter = c;
        setSize(200,200);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,200,200);
        g.setColor(Color.red);
        int x = 0, y = 0;
        for(int i= 0; i != counter.countOf(); i++){
            g.fillOval(x*25, y*25, 20, 20);
            x++;
            if(x>7) {
                x = 0;
                y++;
            }
        }
    }
}
