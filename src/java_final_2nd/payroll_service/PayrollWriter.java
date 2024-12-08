package java_final_2nd.payroll_service;

import java.io.*;

public class PayrollWriter {
    private PrintWriter outfile;

    public PayrollWriter(String file_name){
        try{
            outfile = new PrintWriter(new FileWriter(file_name));
        } catch (IOException e) {
            System.out.println("Error: "+file_name+e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void close(){
        outfile.close();
    }
    public void printCheck(String name, int payment){
        outfile.println(name+","+payment);
    }

    public void printCheck(String s){
        outfile.println(s);
    }
}
