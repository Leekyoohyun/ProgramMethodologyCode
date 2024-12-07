package java_final_1st.file_in_out.payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollWriter {
    private PrintWriter outfile;

    public PayrollWriter(String file_name) {
        try{
            outfile = new PrintWriter(new FileWriter(file_name));
        } catch (IOException e) {
            System.out.println("PayrollWriter Error: "+file_name);
            throw new RuntimeException(e);
        }
    }

    public void close(){
        outfile.close();
    }

    public void printCheck(String name, int payment){
        outfile.println(name + "," + payment);
    }

    public void printCheck(String s){
        outfile.println(s);
    }
}
