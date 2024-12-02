package java_final_1st.event_program.start_version;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        CounterFrame view = new CounterFrame(model);
    }
}
