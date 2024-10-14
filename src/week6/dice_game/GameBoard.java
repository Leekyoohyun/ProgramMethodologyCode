package week6.dice_game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    private int WIDTH = 520;
    private int HEIGHT = 520;
    private Player player1;
    private Player player2;

    public GameBoard(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;

        // JPanel 크기 설정
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // JFrame 생성 및 설정
        JFrame f = new JFrame();
        f.setSize(WIDTH, HEIGHT);
        f.setTitle("주사위 게임");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.getContentPane().add(this);
        f.pack();  // 패널의 크기에 맞춰 창 크기 조정
        f.setVisible(true);
    }


    public void paintComponent(Graphics g) {
        // 배경색 설정
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 플레이어 1 정보 출력
        g.setColor(Color.WHITE);
        g.drawString(player1.name(), 140 ,140);
        g.drawString("누적점수: " + player1.points(), 140, 180);
        if (player1.rolled() != null) {
            g.drawString(player1.rolled().face1() + ", " + player1.rolled().face2(), 140, 260);
        }

        // 플레이어 2 정보 출력
        g.drawString(player2.name(), 370, 140);
        g.drawString("누적점수: " + player2.points(), 370, 180);
        if (player2.rolled() != null) {
            g.drawString(player2.rolled().face1() + ", " + player2.rolled().face2(), 370, 260);
        }

        // 결과 출력
        if (player1.rolled() != null && player2.rolled() != null) {
            if (player1.wins()) {
                g.drawString("이겼다!", 140, 220);
            } else if (player2.wins()) {
                g.drawString("이겼다!", 370, 220);
            } else {
                g.drawString("비겼다!", 235, 220);
            }
        }
    }
}
