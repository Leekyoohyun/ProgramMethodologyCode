package java_final_1st.file_in_out.payroll;

public class PayrollController {

    public void processPayroll(String in, String out) {
        PayrollReader reader = new PayrollReader(in);
        PayrollWriter writer = new PayrollWriter(out);
        while(reader.getNextRecord()){
            int payment = reader.getHours() * reader.getPayrate();
            writer.printCheck(reader.getName(), payment);
        }
        writer.printCheck("!");
        reader.close();
        writer.close();
    }
}
