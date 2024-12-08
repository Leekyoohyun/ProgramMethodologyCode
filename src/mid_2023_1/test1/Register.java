package mid_2023_1.test1;
/*
인풋 뷰 클래스 Registrar
이 클래스는 플레이어에게 정보를 받아서 전달하는 기능을 갖고 있는 인풋 뷰 클래스이다. javax.swing 패키지에서 제공하는 JOptionPane을 활용한다.

                       메소드                       	역할
boolean chooseEven()	플레이어 공격시 홀/짝 여부를 입력받아 리턴한다. true는 짝수, false는 홀수를 의미한다.
int chooseForAttack(int max)	플레이어가 공격 시 몇 개의 구슬을 집을지 입력받는다. max는 플레이어가 현재 가진 구슬의 수와 컴퓨터가 현재 가진 구슬의 수 중 작은 값을 입력받는다. 사용자의 입력은 최소 1에서 최대 5개까지 가능하나, 최대값이 max보다 클 수 없다.
int chooseForGuard(int max)	플레이어가 방어 시 몇 개의 구슬을 집을지 입력받는다. max는 플레이어가 현재 가진 구슬의 수를 입력받는다. 사용자의 입력은 최소 0에서 최대 5개까지 가능하나, 최대값이 max보다 클 수 없다.
 */

import javax.swing.*;

public class Register {
    boolean chooseEven() {
        // 플레이어 공격시 홀/짝 여부를 입력받아 리턴한다. true는 짝수, false는 홀수를 의미한다.
        String input = JOptionPane.showInputDialog("짝수(1) 홀수(0) 입력");
        return input.equals("1");
    }

    int chooseForAttack(int max) {
        // 플레이어가 공격 시 몇 개의 구슬을 집을지 입력받는다. max는 플레이어가 현재 가진 구슬의 수와 컴퓨터가 현재 가진 구슬의 수 중 작은 값을 입력받는다. 사용자의 입력은 최소 1에서 최대 5개까지 가능하나, 최대값이 max보다 클 수 없다.
        String input = JOptionPane.showInputDialog("공격할 구슬�� 수 입력");
        int attack = Integer.parseInt(input);
        return Math.min(attack, max);
    }

    int chooseForGuard(int max) {
        // 플레이어가 방어 시 몇 개의 구슬을 집을지 입력받는다. max는 플레이어가 현재 가진 구슬의 수를 입력받는다. 사용자의 입력은 최소 0에서 최대 5개까지 가능하나, 최대값이 max보다 클 수 없다.
        String input = JOptionPane.showInputDialog("방어할 구슬�� 수 입력");
        int guard = Integer.parseInt(input);
        return Math.min(guard, max);
    }


}
