package mid_reviews.chap1;

import java.text.DecimalFormat;

public class Demo {
    public static void main(String[] args) {
        boolean tag = false;
        tag = tag && true || ! tag;
        System.out.println(tag);

        char hangul = '한';
        System.out.println(hangul);
        System.out.println((int)hangul);
        System.out.println((char)(hangul+1));
        System.out.println((int)(char)(hangul+1));

        int radius;
        double area;
        radius = Integer.parseInt(args[0]);
        area = Math.PI * Math.pow(radius,2);
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println(f.format(area));
    }
}
