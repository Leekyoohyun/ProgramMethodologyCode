package week9.work1;

public class PuzzleStarter {
    public static void main(String[] args) {
        SlidePuzzleBoard board = new SlidePuzzleBoard();
        new PuzzleController(board, new PuzzleWriter(board)).play();
    }
}
