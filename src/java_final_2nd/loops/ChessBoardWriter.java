package java_final_2nd.loops;

import javax.swing.*;

public class ChessBoardWriter extends JPanel {
    private int number_of_rows;
    private int square_size;
    private int panel_width;
    private int offset = 20;

    //Constructor - CHessBoardWriter 패널을 만들고 프레임 씌움
    //rows, size를 받아서 멤버변수에 저장
    public ChessBoardWriter(int rows, int size){
        number_of_rows = rows;
        square_size = size;
        panel_width = number_of_rows * square_size +2* offset;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(panel_width, panel_width);
        frame.setTitle("Chess Board");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //paintComponent - 패널에 그림을 그림
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        for(int row = 0; row < number_of_rows; row++){
            for(int col = 0; col < number_of_rows; col++){
                if((row + col) % 2 == 0){
                    g.setColor(java.awt.Color.WHITE);
                }else{
                    g.setColor(java.awt.Color.BLACK);
                }
                g.fillRect(offset + col * square_size, offset + row * square_size, square_size, square_size);
            }
        }
    }

    public static void main(String[] args) {
        ChessBoardWriter cbw = new ChessBoardWriter(8, 50);
    }
}
