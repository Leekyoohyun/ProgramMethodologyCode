package slidePuzzleGame;

import javax.swing.*;
import java.awt.*;

//슬라이드 퍼즐 만들기 display
public class PuzzleWriter extends JPanel {
    private SlidePuzzleBoard board;
    private final int SIZE = 30; // 퍼즐 조각 크기

    //param b: 슬라이드 퍼즐 보드 배열
    public PuzzleWriter(SlidePuzzleBoard b) {
        board = b;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setSize(SIZE*6, SIZE*6);
        f.setTitle("Slide Puzzle Game");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    //프레임에 퍼즐보드 그리기
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0,0,SIZE,SIZE);
        //contents:
        //PuzzlePiece[][] r = board.contents();
        /* for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                paintPiece(g, r[i][j], i, j);
            }
        }
         */
    }

    // i, j 위치에 퍼즐조각 p 그리기
    private void paintPiece(Graphics g, PuzzlePiece p, int i, int j){
        int x = SIZE+(SIZE*j);
        int y = SIZE+(SIZE*i);
        if(p != null){
            g.setColor(Color.black);
            g.fillRect(x,y,SIZE,SIZE);
            g.setColor(Color.white);
            g.drawRect(x,y,SIZE,SIZE);
            int face_value = p.faceValue();
            g.drawString(face_value+"",x,y);
        }
        else
            g.setColor(Color.white);
        g.fillRect(x,y,SIZE,SIZE);
    }

    //프레임에 현재 퍼즐보드 그리기
    public void displayPuzzle(){
        this.repaint();
    }

    //움직일 수 없는 경우 오류메세지
    public void printError(String s){
        JOptionPane.showMessageDialog(null, "오류 "+s);
    }
}
