package mid_reviews.chap6;

public class TextSearch {
    public int findChar(char c, String s){
        boolean found = false;
        int index = 0;
        while(!found && index<s.length()){
            if(s.charAt(index) == c){
                found = true;
            }else {
                index++;
            }
        }
        if(!found)
            index = -1;
        return index;
    }

    public static void main(String[] args) {
        TextSearch search = new TextSearch();
        System.out.println(search.findChar('a',"Hanyang"));
        System.out.println(search.findChar('e',"Hanyang"));
    }
}
