package week3.work2;

public class Controller {

    void showResult(Model m, View v){
        m.getResult();
        v.showResult(m.getResult());
    }
}
