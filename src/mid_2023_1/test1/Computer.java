package mid_2023_1.test1;
/*
모델 클래스 Computer
이 클래스는 컴퓨터의 모델 클래스이다.

필드	역할
int beads	컴퓨터가 소지한 구슬의 수이다. 생성자 메소드에서 10으로 초기화한다.
                  메소드                  	역할
void addBeads(int n)	컴퓨터의 구슬을 n개 더한다.
void removeBeads(int n)	컴퓨터의 구슬을 n개 뺀다.
int getBeads()	컴퓨터가 소지한 구슬의 수를 리턴한다.
boolean lose()	게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)
int pickForAttack()	컴퓨터가 공격할 때 집을 구슬의 수를 무작위로 리턴한다. 최소값은 1, 최대값은 5이지만 현재 구슬의 수를 넘길 수는 없다.
int pickForGuard()	컴퓨터가 방어할 때 집을 구슬의 수를 무작위로 리턴한다. 최소값은 0, 최대값은 5이지만 현재 구슬의 수를 넘길 수는 없다.
boolean pickEven()	컴퓨터 공격시 선택한 홀/짝을 무작위로 리턴한다. true는 짝수, false는 홀수를 의미한다.

알고리즘
플레이어와 컴퓨터는 번갈아 가면서 다음과 같이 게임을 진행한다.
0 : 플레이어와 컴퓨터는 각각 10개씩의 구슬을 가지고 시작한다.
1 : 플레이어 공격, 컴퓨터 수비
1.1. 컴퓨터는 0개에서 5개의 구슬을 랜덤으로 선택한다. 이때 구슬의 수는 컴퓨터가 가진 구슬의 수를 넘길 수 없다.
1.2. 플레이어는 1개에서 5개의 구슬을 선택한다. 이때 선택하는 구슬은 컴퓨터가 가진 구슬의 수나 플레이어가 가진 구슬의 수를 넘길 수 없다.
1.3. 플레이어는 컴퓨터가 선택한 구슬의 갯수를 짐작하여 짝/홀 중 하나를 선택한다.
1.4. 플레이어가 선택한 짝/홀이 1.1에서 컴퓨터가 선택한 구슬의 짝/홀과 일치할 경우, 플레이어가 승리한다. 그렇지 않으면 플레이어가 패배한다.
0, 2, 4 : 짝, 1, 3, 5 : 홀
1.5. 플레이어가 승리하면 1.2에서 선택한 수만큼의 구슬을 컴퓨터로부터 받는다.
1.6. 플레이어가 패배하면 1.2에서 선택한 수만큼의 구슬을 컴퓨터에게 준다.
2 : 컴퓨터 공격, 플레이어 수비
2.1. 플레이어는 0개에서 5개의 구슬을 선택한다. 이때 구슬의 수는 플레이어가 가진 구슬의 수를 넘길 수 없다.
2.2. 컴퓨터는 1개에서 5개의 구슬을 랜덤으로 선택한다. 이때 선택하는 구슬은 컴퓨터가 가진 구슬의 수나 플레이어가 가진 구슬의 수를 넘길 수 없다.
2.3. 컴퓨터는 랜덤으로 짝/홀 중 하나를 선택한다.
2.4. 컴퓨터가 선택한 짝/홀이 2.1에서 플레이어가 선택한 구슬의 짝/홀과 일치할 경우, 플레이어가 패배한다. 그렇지 않으면 플레이어가 승리한다.
0, 2, 4 : 짝, 1, 3, 5 : 홀
2.5. 플레이어가 승리하면 2.2에서 선택한 수만큼의 구슬을 컴퓨터로부터 받는다.
2.6. 플레이어가 패배하면 2.2에서 선택한 수만큼의 구슬을 컴퓨터에게 준다.
1과 2를 반복해서 게임을 진행한다. 먼저 상대방의 구슬이 0개가 되면 승리한다.
 */

public class Computer {
    private int beads;

    void addBeads(int n) {
        // 컴퓨터의 구슬을 n개 더한다.
        beads += n;
    }

    void removeBeads(int n) {
        // 컴퓨터의 구슬을 n개 뺀다.
        beads -= n;
    }

    int getBeads() {
        // 컴퓨터가 소지한 구슬의 수를 리턴한다.
        return beads;
    }

    boolean lose() {
        // 게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)
        return beads <= 0;
    }

    int pickForAttack() {
        // 컴퓨터가 공격할 때 집을 구슬의 수를 무작위로 리턴한다. 최소값은 1, 최대값은 5이지만 현재 구슬의 수를 넘길 수는 없다.
        int pick = (int)(Math.random() * 5) + 1;
        return Math.min(pick, beads);
    }

    int pickForGuard() {
        // 컴퓨터가 방어할 때 집을 구슬의 수를 무작위로 리턴한다. 최소값은 0, 최대값은 5이지만 현재 구슬의 수를 넘길 수는 없다.
        int pick = (int)(Math.random() * 6);
        return Math.min(pick, beads);
    }

    boolean pickEven() {
        // 컴퓨터 공격시 선택한 홀/짝을 무작위로 리턴한다.
        // true는 짝수, false는 홀수를 의미한다
        int num = (int)(Math.random() * 2);
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}