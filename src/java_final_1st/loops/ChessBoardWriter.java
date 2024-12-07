package java_final_1st.loops;

import javax.swing.*;
import java.awt.*;

public class ChessBoardWriter extends JPanel {
    private int number_of_rows;
    private int square_size;
    private int panel_width;
    private int offset = 20; //

    public ChessBoardWriter(int row, int size){
        number_of_rows = row;
        square_size = size;
        panel_width = number_of_rows * square_size+ 2 * offset;

        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Chess Board");
        f.setSize(panel_width, panel_width+28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, panel_width, panel_width);
        paintBoard(offset, offset, number_of_rows, square_size, g);
    }

    /* paintBoard 체스보드를 그림
     * @param start_x 체스보드 좌상단 x좌표
     * @param start_y 체스보드 좌상단 y좌표
     * @param rows 체스보드 열 개수
     * @param size 체스보드 칸 너비
     * @param g 그래픽스 펜
     */
    private void paintBoard(int start_x, int start_y, int rows, int size, Graphics g){
        for(int x = 0; x < rows; x++){
            // x 열까지 그렸음(x 증가 전)
            int x_position = start_x + x * size;
            for(int y = 0; y < rows; y++){
                // x 열의 y 칸까지 그림( x 증가 후, y 증가 전)
                int y_position = start_y + y * size;
                if((x + y) % 2 == 0){
                    g.setColor(Color.BLACK);
                }else{
                    g.setColor(Color.WHITE);
                }
                g.fillRect(x_position, y_position, size, size);
            }
        }
    }

    public static void main(String[] args) {
        new ChessBoardWriter(5, 40);
    }
}
