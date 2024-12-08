package final_2021_1.problem1_2;

public class HospitalController {
    private Hospital hospital; // 병원 객체
    private Displayer displayer; // 출력 객체
    private Reader reader; // 입력 객체
    private int new_id = 1001; // 신규 환자 등록번호, 1001 = 첫 환자의 등록번호

    public HospitalController(Hospital h, Displayer d, Reader r) {
        hospital = h;
        displayer = d;
        reader = r;
    }

    // 입원실 관리 서비스 (무한 루프)
    // [5번 - 배점 10점]
    public void manageRooms() {
        while (true) {
            double temperature;
            int bp_high, bp_low, id;
            Patient p;
            String input = reader.readMenu("+ or -");
            if(input.equals("+")){
                if(hospital.roomAvailable()==true){
                    id = new_id;
                    temperature = reader.readDouble("give temperature");
                    bp_high = reader.readInteger("give bp high");
                    bp_low = reader.readInteger("give bp low");
                    hospital.admit(new Patient(id, temperature, bp_high, bp_low));
                    new_id++;
                }else{
                    displayer.showMessage("병실 없습니다.");
                }
            }else{
                id = reader.readInteger("give id");
                p = hospital.findPatient(id);
                if(p != null){
                    hospital.discharge(p);
                    displayer.showMessage(p.getID()+" 환자 퇴실");
                }else{
                    displayer.showMessage(p.getID()+" 환자 찾을 수 없음");
                }
            }
            displayer.display();
        }

    }
}
