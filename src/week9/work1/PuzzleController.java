package week9.work1;

import javax.swing.*;

public class PuzzleController {
    private SlidePuzzleBoard board;
    private PuzzleWriter writer;

    // 생성자: 퍼즐 보드와 출력 뷰 초기화
    public PuzzleController(SlidePuzzleBoard board, PuzzleWriter writer) {
        this.board = board;
        this.writer = writer;
    }

    // 퍼즐 게임을 시작하는 메소드
    public void play() {
        while (true) {
            writer.displayPuzzle();

            String input = JOptionPane.showInputDialog("움직일 퍼즐 조각 번호를 선택하세요.");
            if (input == null) {
                break; // 사용자가 입력을 취소하면 게임 종료
            }

            if (isNumeric(input)) {
                int value = Integer.parseInt(input);
                if (!board.move(value)) {
                    writer.printError("움직일 수 없습니다.");
                }
            } else {
                writer.printError("유효한 숫자를 입력하세요.");
            }
        }
    }

    // 숫자인지 확인하는 메소드
    private boolean isNumeric(String str) {
        return str.matches("\\d+"); // 정규 표현식을 사용하여 숫자만 있는지 확인
    }
}

