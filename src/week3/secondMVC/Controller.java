package week3.secondMVC;

public class Controller {
    void controller() {
        Model m = new Model();
        View v = new View();
        v.showTime(m.whatTimeIsItNow());
    }
}
