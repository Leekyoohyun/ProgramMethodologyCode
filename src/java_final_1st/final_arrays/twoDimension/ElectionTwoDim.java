package java_final_1st.final_arrays.twoDimension;

public class ElectionTwoDim {
    public static void main(String[] args) {
        int[][] election = new int[3][4]; //1,2,3학년 - 1,2,3,4 기호

        for(int j=0; j < 4; j++){
            int votes = 0;
            for(int i=0; i<3; i++){
                votes += election[i][j];
            }
            System.out.println("기호 "+(j+1)+"번은 "+votes+"표 받음");
        }

        for(int i=0; i<3; i++){
            int votes = 0;
            for(int j=0; j<4; j++){
                votes = votes+election[i][j];
            }
            System.out.println((i+1)+"학년은 "+votes+"행사");
        }

    }
}
