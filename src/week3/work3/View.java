package week3.work3;

import javax.swing.*;

public class View {
    int getMass(){
        String message = "put \"mass\" in integer";
        int in = Integer.parseInt(JOptionPane.showInputDialog(message));
        return in;
    }

    int getVelocity(){
        String message = "put \"Velocity\" in integer";
        int in = Integer.parseInt(JOptionPane.showInputDialog(message));
        return in;
    }

    void showP(int p){
        JOptionPane.showMessageDialog(null, "particle's momentum is "+p);
    }

}
