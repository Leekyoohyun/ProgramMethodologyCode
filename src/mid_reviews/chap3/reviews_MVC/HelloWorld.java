package mid_reviews.chap3.reviews_MVC;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller();
        c.control(m,v);
    }
}
