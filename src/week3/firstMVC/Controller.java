package week3.firstMVC;

public class Controller {
    void control(Model m, View v) {
        v.show(m.createGreetings());
    }
}
