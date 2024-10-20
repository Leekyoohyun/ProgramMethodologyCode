package mid_reviews.chap1;

import java.text.*;

public class TempConverter {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double f = (9.0/5.0)*c+32;
        DecimalFormat formatter = new DecimalFormat("0.0");
        System.out.println("섭씨 온도 "+c+"도는 화씨로 "+formatter.format(f)+" 도");
    }
}
