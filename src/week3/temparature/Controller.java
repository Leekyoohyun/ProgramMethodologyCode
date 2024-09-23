package week3.temparature;

public class Controller {
    void control(Model m, View v){
        double c = v.getTemperature();
        double f = m.ctof(c);
        v.showTemperature(c,f);

        //왜 Controller를 만들어야하는가
    }
}
