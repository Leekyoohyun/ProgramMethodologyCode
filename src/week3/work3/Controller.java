package week3.work3;

public class Controller {
    void control(Model model, View view) {
        view.showP(model.getP(view.getMass(), view.getVelocity()));
    }
}
