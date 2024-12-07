package java_final_1st.event_program.puzzleGame;

public class PuzzlePiece {
    private int face;

    //** Constrictor - PizzlePiece 퍼즐 조각 만들기
    //* @param value - 퍼즐 조각 위에 표시되는 값
    public PuzzlePiece(int value) {
        face = value;
    }

    //face- 조각의 액면 값을 리턴
    public int getFace() {
        return face;
    }
}
