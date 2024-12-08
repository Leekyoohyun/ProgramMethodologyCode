package java_final_2nd.loops;

public class TextSearch {
    //findChar 문자열에서 가장 먼저 나타나는 문자 검색 첫 인덱스 c,검색 문자는 s, 없으면 -1
    public int findChar(char c, String s){
        boolean found = false;
        int index = 0;
        while(index < s.length() && !found){
            if(s.charAt(index) == c){
                found = true;
            }else{
                index += 1;
            }
        }
        if(!found){
            index = -1;
        }
        return index;
    }

    public static void main(String[] args) {
        //Hanyang에서 a, e를 검색
        TextSearch ts = new TextSearch();
        System.out.println(ts.findChar('a', "Hanyang"));
        System.out.println(ts.findChar('e', "Hanyang"));

        Box box = new Box(50);
        MovingBall ball = new MovingBall(10, 10, 5, box);
        while(true){
            ball.move(1);
            System.out.println("Ball position: (" + ball.xPosition() + "," + ball.yPosition() + ")");
        }
    }

}
