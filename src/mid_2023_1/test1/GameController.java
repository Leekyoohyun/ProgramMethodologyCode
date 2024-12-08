package mid_2023_1.test1;
/*
컨트롤러 클래스 GameController
이 클래스는 구슬 홀짝 맞추기 게임을 총괄하여 진행하는 play 메소드와 함께 플레이어, 컴퓨터의 턴을 진행하는 두 메소드 playerTurn, computerTurn 을 구현하면 된다. 초기화 메소드에서 입력받은 세 객체를 필드변수로 저장하고, 다른 세 메소드에서 이 필드변수를 사용한다.

필드	역할
Player player	컨트롤러 클래스가 접근하기 위해 저장한 Player 객체.
Computer computer	컨트롤러 클래스가 접근하기 위해 저장한 Computer 객체.
Registrar registrar	컨트롤러 클래스가 접근하기 위해 저장한 Registrar 객체.
                                         메소드                                         	역할
GameController(Player p, Computer c, Regstrar r)	생성자 메소드. 입력받은 세 객체 Player, Computer, Registrar 를 필드변수에 저장한다.
void playerTurn()	플레이어의 턴을 진행한다.
void computerTurn()	컴퓨터의 턴을 진행한다.
void play()	플레이어와 컴퓨터의 턴을 어느 한쪽의 구슬이 모두 소진될 때까지 반복한다.
 */

public class GameController {
    private Player player;
    private Computer computer;
    private Register register;

    public GameController(Player p, Computer c, Register r) {
        this.player = p;
        this.computer = c;
        this.register = r;
    }

    void playerTurn() {
        int playerBeads = player.getBeads();
        int computerBeads = computer.getBeads();
        int attack = register.chooseForAttack(Math.min(playerBeads, computerBeads));
        int guard = register.chooseForGuard(playerBeads);
        boolean even = register.chooseEven();
        if (even) {
            player.addBeads(attack);
            computer.removeBeads(attack);
        } else {
            player.removeBeads(attack);
            computer.addBeads(attack);
        }
    }

    void computerTurn() {
        int playerBeads = player.getBeads();
        int computerBeads = computer.getBeads();
        int attack = computer.pickForAttack();
        int guard = register.chooseForGuard(playerBeads);
        boolean even = computer.pickEven();
        if (even) {
            player.removeBeads(attack);
            computer.addBeads(attack);
        } else {
            player.addBeads(attack);
            computer.removeBeads(attack);
        }
    }

    void play() {
        while (!player.lose() && !computer.lose()) {
            playerTurn();
            if (player.lose() || computer.lose()) {
                break;
            }
            computerTurn();
        }
        if (player.lose()) {
            System.out.println("플레이어 패배");
        } else {
            System.out.println("플레이어 승리");
        }
    }
}
