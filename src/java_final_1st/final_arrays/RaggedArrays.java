package java_final_1st.final_arrays;

import java.util.Arrays;

public class RaggedArrays {
    //들쭉날죽배열
    public static void main(String[] args) {
        double[][] ragged = new double[4][];
        System.out.println(Arrays.toString(ragged)); // 기본상태: [null, null, null, null]

        ragged[0] = new double[2];
        System.out.println(Arrays.toString(ragged)); //추가: [[D@7b23ec81, null, null, null]

        ragged[2] = new double[1];
        ragged[3] = new double[0];
        System.out.println(Arrays.toString(ragged)); //추가: [[D@7b23ec81, null, [D@6acbcfc0, [D@5f184fc6]

        int[][] ragged2 = new int[4][4];
        for(int i=0; i< ragged2.length; i++){
            for(int j=0; j<ragged2.length; j++){
                ragged2[i][j] = i+1;
            }
        }
        System.out.println(Arrays.deepToString(ragged2));
    }
}
