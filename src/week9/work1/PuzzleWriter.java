package week9.work1;

import javax.swing.*;
import java.awt.*;


public class PuzzleWriter extends JPanel {
    private SlidePuzzleBoard board;
    private final int SIZE;
    private final int squareSize = 60; // 셀 크기
    private final int offset = 20; // 보드의 외곽 여백
    private final int panelWidth;

    // 생성자: 퍼즐 보드와 크기를 초기화하고 JFrame 설정
    public PuzzleWriter(SlidePuzzleBoard board) {
        this.board = board;
        this.SIZE = board.contents().length;
        this.panelWidth = SIZE * squareSize + 2 * offset;

        JFrame frame = new JFrame("Slide Puzzle");
        frame.getContentPane().add(this);
        frame.setSize(panelWidth, panelWidth + 28); // 패널 크기 설정
        frame.getContentPane().setBackground(Color.YELLOW); // 배경색 노란색 설정
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 퍼즐 보드를 다시 그리는 메소드
    public void displayPuzzle() {
        repaint();
    }

    // 경고 메시지를 출력하는 메소드
    public void printError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, panelWidth, panelWidth); // 배경을 노란색으로 설정
        paintBoard(offset, offset, SIZE, squareSize, g); // 퍼즐 보드 그리기
    }

    // 퍼즐 보드를 그리는 메소드
    private void paintBoard(int startX, int startY, int rows, int size, Graphics g) {
        PuzzlePiece[][] contents = board.contents();

        for (int row = 0; row < rows; row++) {
            int xPosition = startX + row * size;
            for (int col = 0; col < rows; col++) {
                int yPosition = startY + col * size;

                PuzzlePiece piece = contents[row][col];

                // 빈 조각일 경우 검정색으로 설정
                if (piece == null) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.WHITE); // 퍼즐 조각은 흰색으로 설정
                }

                g.fillRect(xPosition, yPosition, size, size);

                // 퍼즐 조각의 faceValue 표시 (빈칸은 표시하지 않음)
                if (piece != null) {
                    g.setColor(Color.BLUE);
                    g.drawString(String.valueOf(piece.faceValue()), xPosition + size / 2 - 5, yPosition + size / 2 + 5);
                }
            }
        }
    }
}
