package java_final_1st.event_program.count_review;

public class CouterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        CounterFrame view = new CounterFrame(model);
    }
}
