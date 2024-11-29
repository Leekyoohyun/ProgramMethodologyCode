package java_final_1st.final_arrays;

import javax.swing.*;

public class VoteCount {
    //투표 프로그램
    public static void main(String[] args) {
        int num_candidates = 4; // 후보자
        String[] votes = new String[num_candidates];

        int votesCount0 =0;
        int votesCount1 =0;
        int votesCount2 =0;
        int votesCount3 =0;

        boolean processing = true;
        while(processing){
            String input = JOptionPane.showInputDialog("원하는 후보에 투표: 규현, 민성, 경승, 용준");
            String v = input;
            {
                if (v.equals("규현"))
                    votesCount0+=1;
                else if (v.equals("민성"))
                    votesCount1+=1;
                else if (v.equals("경승"))
                    votesCount2+=1;
                else if (v.equals("용준"))
                    votesCount3+=1;
                else
                    processing = false;
            }
        }

        System.out.println("후보 "+1+"번이 "+votesCount0+"표를 득표하였습니다.");
        System.out.println("후보 "+2+"번이 "+votesCount1+"표를 득표하였습니다.");
        System.out.println("후보 "+3+"번이 "+votesCount2+"표를 득표하였습니다.");
        System.out.println("후보 "+4+"번이 "+votesCount3+"표를 득표하였습니다.");
    }
}
