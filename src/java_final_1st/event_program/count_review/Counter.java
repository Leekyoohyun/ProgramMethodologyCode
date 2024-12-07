package java_final_1st.event_program.count_review;

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
