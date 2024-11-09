package mid_reviews.chap5.diceGame;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    Registrar r = new Registrar();
    Player p1 = new Player(r.invitePlayer());
    Player p2 = new Player(r.invitePlayer());

    public GameBoard() {
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Dice Game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(220, 200);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString(p1.name,30,30);
        g.drawString(p2.name,130,30);
        g.drawString("누적 점수: "+p1.points,30,50);
        g.drawString("누적 점수: "+p2.points, 130,50);
        g.drawString(" "+p1.rolled,30,90);
        g.drawString(" "+p2.rolled,130,90);

    }

    public static void main(String[] args) {
        new GameBoard();
    }
}
