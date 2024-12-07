package final_2021_1.problem1;

public class HospitalManager {
    public static void main(String[] args) {
        Hospital h = new Hospital(4);
        new HospitalController(h, new Displayer(h), new Reader()).manageRooms();
    }
}
