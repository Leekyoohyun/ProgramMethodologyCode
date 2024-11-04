package week9.work1;

public class SlidePuzzleBoard {
    private PuzzlePiece[][] board;
    private int emptyRow;
    private int emptyCol;
    private final int SIZE;

    // 생성자: 퍼즐 보드를 SIZE 크기로 초기화
    public SlidePuzzleBoard(int size) {
        this.SIZE = size;
        board = new PuzzlePiece[SIZE][SIZE];
        initializeBoard();
    }

    // 보드를 초기화하는 메소드
    private void initializeBoard() {
        int number = 1;

        // 보드의 제일 마지막 행과 열부터 퍼즐 조각을 채움
        for (int row = SIZE - 1; row >= 0; row--) {
            for (int col = SIZE - 1; col >= 0; col--) {
                if (row == SIZE - 1 && col == SIZE - 1) {
                    // 마지막 셀을 빈칸으로 설정
                    board[row][col] = null;
                    emptyRow = row;
                    emptyCol = col;
                } else {
                    board[row][col] = new PuzzlePiece(number);
                    number++;
                }
            }
        }
    }

    // 현재 퍼즐 보드 배열을 반환
    public PuzzlePiece[][] contents() {
        return board;
    }

    // 특정 퍼즐 조각을 빈칸으로 이동하는 메소드
    public boolean move(int value) {
        if (value == 0) {
            return false; // 빈 조각은 값이 없으므로 이동할 수 없음
        }

        if (isAdjacentToEmpty(value)) {
            // 퍼즐 조각을 빈칸으로 이동
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    if (board[row][col] != null && board[row][col].faceValue() == value) {
                        board[emptyRow][emptyCol] = board[row][col];
                        board[row][col] = null;
                        emptyRow = row;
                        emptyCol = col;
                        return true;
                    }
                }
            }
        }
        return false; // 이동 실패 시 false 반환
    }

    // 특정 값이 빈칸 옆에 있는지 확인하는 메소드
    private boolean isAdjacentToEmpty(int value) {
        return (found(value, emptyRow - 1, emptyCol) ||
                found(value, emptyRow + 1, emptyCol) ||
                found(value, emptyRow, emptyCol - 1) ||
                found(value, emptyRow, emptyCol + 1));
    }

    // 특정 위치에 퍼즐 조각이 있는지 확인하는 메소드
    public boolean found(int value, int row, int col) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
            PuzzlePiece piece = board[row][col];
            return piece != null && piece.faceValue() == value;
        }
        return false;
    }
}
