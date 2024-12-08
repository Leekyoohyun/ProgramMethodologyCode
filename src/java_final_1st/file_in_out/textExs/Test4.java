package java_final_1st.file_in_out.textExs;

import javax.swing.*;
import java.io.*;

public class Test4 {
    public static void main(String[] args) throws Exception{
        String file_name = JOptionPane.showInputDialog("읽을 파일");
        FileReader reader = new FileReader(file_name);
        BufferedReader infile = new BufferedReader(reader);
        FileWriter writer = new FileWriter(file_name+".out");
        PrintWriter outfile = new PrintWriter(writer);
        while(infile.ready()){
            String s = infile.readLine();
            outfile.println(s);
        }
        outfile.close();
        infile.close();

    }
}
