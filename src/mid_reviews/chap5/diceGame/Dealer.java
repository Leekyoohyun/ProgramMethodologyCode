package mid_reviews.chap5.diceGame;

import week6.dice_game.GameBoard;

public class Dealer {
    Dice d1 = new Dice();
    Dice d2 = new Dice();

    public void dealDiceGame(Player p1, Player p2, GameBoard b, Registrar r){
        p1.name =r.invitePlayer();
        p2.name = r.invitePlayer();

        while(true) {
            if (p1.points == 0 || p1.points >= p2.points) {
                p1.play(d1);
                p2.play(d2);
            }else{
                p2.play(d2);
                p1.play(d1);
            }

            //승패 결정
            if(d1.twin() && !d2.twin()){
                p1.receivePoint();
            }else if(!d1.twin() && d2.twin()){
                p2.receivePoint();
            }else if(d1.twin() && d2.twin()){
                if(d1.face1()>d2.face1()){
                    p1.receivePoint();
                }else if(d1.face1()<d2.face1()) {
                    p2.receivePoint();
                }else{
                    p1.receivePoint();
                    p2.receivePoint();
                }
            }else{ //이제 쌍둥이아니야
                if(d1.sum()>d2.sum()){
                    p1.receivePoint();
                }else if(d1.sum()<d2.sum()){
                    p2.receivePoint();
                }else{
                    if(d1.difference()>d2.difference()){
                        p2.receivePoint();
                    }else if(d1.difference()<d2.difference()){
                        p1.receivePoint();
                    }else{
                        p1.receivePoint();
                        p2.receivePoint();
                    }
                }
            }
        }
    }


}
