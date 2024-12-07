package java_final_1st.event_program.puzzleGame;

public class SlidePuzzleBoard {
    private PuzzlePiece[][] board;
    //빈칸의 좌표
    private int empty_row;
    private int empty_col;
    // representation invariant: board[empty_row][empty_col] == null

    //Constructor - SlidePuzzleBoard 초기 퍼즐보드 설정 - 감소하는 순으로 나열
    public SlidePuzzleBoard(){
        // 4*4 보드 만들기
        board = new PuzzlePiece[4][4];
        // 퍼즐 조각 1~15를 board 에 역순으로 끼우기
        int number = 15;
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                board[row][col] = new PuzzlePiece(number);
                number -= 1;
            }
        }
        board[3][3] = null;
        empty_row = 3;
        empty_col = 3;
    }

    // getPuzzlePiece - 퍼즐 조각을 리턴
    // row - 가로줄 인덱스
    // col - 세로줄 인덱스
    // return 퍼즐조각
    public PuzzlePiece gerPuzzlePiece(int row, int col){
        return board[row][col];
    }

    //이동 가능하면, 퍼즐 조각을 빈칸으로 이동
    // w - 이동하기 원하는 퍼즐 조각 번호
    // return - 이동 성공하면 true, 불가능하면 false
    public boolean move(int w) {
        int row, col; // w의 위치
        // 빈칸에 주변에서 w 의 위치를 찾음
        if (found(w, empty_row - 1, empty_col)) {
            row = empty_row - 1;
            col = empty_col;
        } else if (found(w, empty_row + 1, empty_col)) {
            row = empty_row + 1;
            col = empty_col;
        } else if (found(w, empty_row, empty_col - 1)) {
            row = empty_row;
            col = empty_col - 1;
        } else if (found(w, empty_row, empty_col + 1)) {
            row = empty_row;
            col = empty_col + 1;
        } else
            return false;
        // w 를 빈칸에 복사
        board[empty_row][empty_col] = board[row][col];
        //빈칸 위치를 새로 설정하고, w를 제거
        empty_row = row;
        empty_col = col;
        board[empty_row][empty_col] = null;
        return true;
    }

    //found - board[row][col] 에 퍼즐 조각 v 가 있는지 확인
    private boolean found(int v, int row, int col){
        if(row >= 0 && row <= 3 && col >= 0 && col <= 3){
            return board[row][col].getFace() == v;
        }
        else
            return false;
    }
}
