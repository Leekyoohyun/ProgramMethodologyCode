package java_final_1st.event_program.second_version;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        Drawing panel = new Drawing(model);
        new CounterFrame(model, panel);
    }
}
