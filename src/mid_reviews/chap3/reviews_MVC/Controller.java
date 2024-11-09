package mid_reviews.chap3.reviews_MVC;

public class Controller {
    public void control(Model m, View v){
        String input = m.createMessage();
        v.showByConsole(input);
        //v.showByConsole(input);
    }


}
