package week3.answerFor2ndMVC;

public class Controller {
    void control(Model m, View v){
        v.show(m.whatTimeIsIt());
        v.showSwing(m.whatTimeIsIt());

        //원하는 거 쓰면 되는거다
    }
}
