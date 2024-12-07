package java_final_1st.file_in_out.payroll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class PayrollReader {

    private BufferedReader infile;
    private final String EOF = "!";
    private String name;
    private int hours, payrate;

    public PayrollReader(String file_name){
        try{
            infile = new BufferedReader(new FileReader(file_name));
        }
        catch (Exception e){
            System.out.println("PayrollReader Error - bad file name: + file_name");
            throw new RuntimeException(e.toString());
        }
    }

    public String getName(){
        return name;
    }
    public int getHours() {
        return hours;
    }
    public int getPayrate() {
        return payrate;
    }

    public void close(){
        try{infile.close();}
        catch (Exception e){
            System.out.println("PayrollReader Warning - file close failed");
        }
    }

    public boolean getNextRecord(){
        boolean result = false;
        try{
            if(infile.ready()){
                String line = infile.readLine();
                StringTokenizer t = new StringTokenizer(line,",");
                String s = t.nextToken().trim();
                if(! s.equals(EOF))
                    if(t.countTokens() == 2){
                        name = s;
                        hours = Integer.parseInt(t.nextToken().trim());
                        payrate = Integer.parseInt(t.nextToken().trim());
                        result = true;
                    }
                else{
                        throw new RuntimeException();
                }
            }
        }
        catch (Exception e){
            System.out.println("PayrollReader Error - bad record format: "+e.getMessage()+" Skipping");
            result = getNextRecord();
        }
        return result;
    }
}

