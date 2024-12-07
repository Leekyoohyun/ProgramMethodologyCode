package java_final_1st.loops;

public class TextSearch {
    // findChar 문자열에서 가장 먼저 나타나는 문자를 검색
    // c - 검색할 문자
    // s - 검색 대상 문자
    // s 에서 가장 먼저 나타나는 문자 c 의 인덱스, 없으면 -1
    public int findChar(char c, String s) {
        boolean found = false;
        int index = 0;
        while(!found && index < s.length()){
            if(s.charAt(index) == c)
                found = true;
            else
                index += 1;
        }
        if(!found)
            index += 1;
        return index;
    }

    public static void main(String[] args) {
        TextSearch search = new TextSearch();
        System.out.println(search.findChar('a', "Hanyang"));
        System.out.println(search.findChar('e', "Hanyang"));
    }
}
