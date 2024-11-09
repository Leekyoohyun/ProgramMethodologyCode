package mid_reviews.chap3.reviews_MVC;

import javax.swing.*;

public class View {
    public  void showByConsole(String message) {
        System.out.println(message);
    }

    public void showByGUI(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
