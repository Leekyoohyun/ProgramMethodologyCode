package week11.work2;

public class PuzzlePiece {
    private int face;

    /** Constructor - PuzzlePiece 퍼즐 조각을 만듬
     * @param value - 퍼즐 조각 위에 표시되는 값  */
    public PuzzlePiece(int value) {
        face = value;
    }

    /** face - 조각의 액면 값을 리턴  */
    public int face() {
        return face;
    }
}
