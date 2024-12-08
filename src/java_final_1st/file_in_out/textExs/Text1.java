package java_final_1st.file_in_out.textExs;

public class Text1 {
    public static void main(String[] args) {
        String s = "abc";
        char[] t = new char[3];
        t[0] = 'a';
        t[1] = 'b';
        t[2] = 'c';
        //System.out.println(s == t);
        System.out.println(s.equals(t));

        String a = "abc";
        String b = "abc";
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true

        String c = "acb";
        String d = new String("acb");
        System.out.println( c == d); //false
        System.out.println( c.equals(d));//true
    }
}
