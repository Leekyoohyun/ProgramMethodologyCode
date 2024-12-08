package java_final_2nd.counter;

public class Counter {
    private int count;

    public Counter(int start) {
        count = start;
    }

    public void increase() {
        count += 1;
    }

    public int countOf(){
        return count;
    }

}
