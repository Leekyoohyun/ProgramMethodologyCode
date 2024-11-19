package slidePuzzleGame;

import javax.swing.*;

public class PuzzleController {
    private SlidePuzzleBoard board;
    private PuzzleWriter writer;

    // PuzzleController 슬라이드 퍼즐 조각의 움직임 제어
    public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
        board = b;
        writer = w;
    }

    //play 퍼즐 시작
    public void play(){
        while(true){
            writer.displayPuzzle();
            String input = JOptionPane.showInputDialog("움직일 퍼즐조각을 입력하세요");
            int n = Integer.parseInt(input);
            if(! board.move(n))
                writer.printError("움직일 수 없음.");
        }
    }

}
