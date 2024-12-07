package java_final_1st.loops;

public class TextSearch_For {
    public int findChar(char c, String s){
        int index = 0;
        for(index = 0; index < s.length() && s.charAt(index) != c ;index++);

        if(index == s.length())
                index = -1;

        return index;
    }

    public static void main(String[] args) {
        TextSearch_For search = new TextSearch_For();
        System.out.println( search.findChar('a', "Hanyang"));
        System.out.println( search.findChar('e', "Hanyang"));
    }
}
