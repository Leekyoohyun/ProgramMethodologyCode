package java_final_1st.final_arrays;

import javax.swing.*;

public class TwoDimArrays {
    public static void main(String[] args) {
        int votes[][] = new int[3][4]; // 배열 공간 생성

        for(int i=0; i < votes.length; i++) {
            String input1 = JOptionPane.showInputDialog((i+1)+"학년들 투표: 기호1번, 2번, 3번, 4번");
            int votes_in = Integer.parseInt(input1);
            while (true) {
                if (votes_in > 0 && votes_in < votes[0].length) {
                    votes[i][votes_in] += 1;
                } else {
                    break;
                }
            }
        }

        //결과출력
        for(int i=0; i<votes.length; i++){
            System.out.println((i+1)+"학년 투표: "+votes[0][i]);
            System.out.println((i+1)+"학년 투표: "+votes[1][i]);
            System.out.println((i+1)+"학년 투표: "+votes[2][i]);
        }

    }
}
