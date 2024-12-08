package java_final_1st.file_in_out.textExs;

import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("poem.txt");
        PrintWriter outfile = new PrintWriter(writer);
        outfile.println("방학이 되면 ");
        outfile.println("뭘할까?");
        outfile.close();
    }
}
