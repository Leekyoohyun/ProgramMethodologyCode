package java_final_2nd.loops;

public class TextSearch2 {
    //findChar 문자열에서 가장 먼저 나타나는 문자 검색 첫 인덱스 c,검색 문자는 s, 없으면 -1
    public int findChar(char c, String s){
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == c) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Hanyang에서 a, e를 검색
        TextSearch ts = new TextSearch();
        System.out.println(ts.findChar('a', "Hanyang"));
        System.out.println(ts.findChar('e', "Hanyang"));
    }
}