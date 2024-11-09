package mid_reviews.chap5.diceGame;

import javax.swing.*;

public class Registrar {
    public String invitePlayer() {
        String playerName = JOptionPane.showInputDialog("플레이어 이름을 입력하세요.");
        return playerName;
    }

    public int wantToContinue(){
        return JOptionPane.showConfirmDialog(null, "더할래?");
    }
}
