package mid_2023_1.test1;

public class Player {
    /*
    모델 클래스 Player
    이 클래스는 플레이어의 모델 클래스이다.

    필드	역할
    int beads	플레이어가 소지한 구슬의 수이다. 생성자 메소드에서 10으로 초기화한다.
    메소드	역할
    void addBeads(int n)	플레이어의 구슬을 n개 더한다.
    void removeBeads(int n)	플레이어의 구슬을 n개 뺀다.
    int getBeads()	플레이어가 소지한 구슬의 수를 리턴한다.
    boolean lose()	게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)
     */
    private int beads;

    public void addBeads(int n) {
        // 플레이어의 구슬을 n개 더한다.
        beads += n;
    }

    public void removeBeads(int n) {
        // 플레이어의 구슬을 n개 뺀다.
        beads -= n;
    }

    public int getBeads() {
        // 플레이어가 소지한 구슬의 수를 리턴한다.
        return beads;
    }

    public boolean lose() {
        // 게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)
        return beads <= 0;
    }
}
