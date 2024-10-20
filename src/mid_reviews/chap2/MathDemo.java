package mid_reviews.chap2;

public class MathDemo {
    public static void main(String[] args) {
        int a = 3;
        double r = a; // 묵시적 타입변환
        System.out.println(r); // 3.0 출력

        int b = 3;
        double k = b;
        k = (int)k+1;   // 명시적 타입변환
        System.out.println(k);

        double c = 3.14;
        System.out.println(Math.sqrt(c));
        System.out.println(Math.pow(c,2));
        System.out.println(Math.abs(-c));

        String s = "  하나의  한양  ";
        System.out.println(s.trim());
        String s1 = "창의와 나눔으로 세상에 힘이 되는 한양";
        String s2 = "   창의와 나눔으로 세상에 힘이 되는 한양   ";
        String s3 = "창의와 나눔으로 세상에 힘이 되는 한양";
        String s4 = s2.trim();
        System.out.println(s1 == "창의와 나눔으로 세상에 힘이 되는 한양");
        System.out.println();
        System.out.println(s1.charAt(5));
        System.out.println(s1.substring(4,6));

        System.out.println(s1 == s4);

        String slogan_E = "Hanyang: Ancient Capital, Modern Academics";
        System.out.println(slogan_E.toUpperCase());
        System.out.println(slogan_E.toLowerCase());
        System.out.println(slogan_E.indexOf("o")); // 앞에 있으면 앞에꺼가 나옴
        System.out.println(slogan_E.indexOf("o",6)); //6번째부터 찾는다
        System.out.println("a".compareTo("c"));
        System.out.println("C".compareTo("A"));


    }

}
