package java_final_1st.event_program.third_counter;

public class Counter {
    private int count;

    public Counter(int c) {
        this.count = c;
    }

    public void increment(){
        count++;
    }

    public int countOf(){
        return count;
    }
}
