package week3.temparature;

public class Temperature {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller();
        c.control(m,v);
    }

    // 실행 starter
}
