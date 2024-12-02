package java_final_1st.event_program.second_version;

public class Counter {
    private int count;

    //Counter 카운터 초기 설정
    //start 카운터의 초기값

    public Counter(int start){
        count = start;
    }

    //increment 카운터 값 증가
    public void increment(){
        count++;
    }

    //countOf 카운터 값 리턴
    //카운터 현재 값
    public int countOf(){
        return count;
    }
}
