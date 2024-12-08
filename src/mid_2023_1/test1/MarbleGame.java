package mid_2023_1.test1;

public class MarbleGame {
    public static void main(String[] args) {
        Player p = new Player();
        Computer c = new Computer();
        Register r = new Register();
        new GameController(p, c, r).play();
    }
}
