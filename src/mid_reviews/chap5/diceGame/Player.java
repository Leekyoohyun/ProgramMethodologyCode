package mid_reviews.chap5.diceGame;

/*
* 게임 플레이어 생성
* MODEL 클래스
* 플레이어이름: name
* 누적이긴횟수: points
* 주사위 기억: rolled
* 승패여부: wins
 */
public class Player {
    public String name;
    public int points;
    public  Dice rolled;
    public boolean wins;

    public Player(String name) {
        this.name = name;
    }

    public void play(Dice d){
        d.rollDice();
        rolled = d;
    }

    public void receivePoint(){
        points += 1;
        wins = true;
    }

    public void reset(){
        wins = false;
    }
}
