package week3.work3;

public class CalcP {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
        controller.control(model, view);
    }
}