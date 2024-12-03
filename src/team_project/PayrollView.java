package team_project;

import javax.swing.*;

public class PayrollView {
    public String input_name() {
        String name_in;
        do {
            name_in = JOptionPane.showInputDialog("입력 파일명을 입력하세요:");
            if (name_in == null) { // 취소 버튼 처리
                int response = JOptionPane.showConfirmDialog(
                        null,
                        "입력을 취소하셨습니다. 프로그램을 종료하시겠습니까?",
                        "종료 확인",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    System.exit(0); // 프로그램 종료
                }
            } else if (name_in.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "입력 파일명을 입력해야 합니다.");
            }
        } while (name_in == null || name_in.trim().isEmpty());
        return name_in.trim();
    }

    public String output_name() {
        String name_out;
        do {
            name_out = JOptionPane.showInputDialog("출력 파일명을 입력하세요:");
            if (name_out == null) { // 취소 버튼 처리
                int response = JOptionPane.showConfirmDialog(
                        null,
                        "입력을 취소하셨습니다. 프로그램을 종료하시겠습니까?",
                        "종료 확인",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    System.exit(0); // 프로그램 종료
                }
            } else if (name_out.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "출력 파일명을 입력해야 합니다.");
            }
        } while (name_out == null || name_out.trim().isEmpty());
        return name_out.trim();
    }


}
