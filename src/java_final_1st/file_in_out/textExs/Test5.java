package java_final_1st.file_in_out.textExs;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws Exception{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(reader);
        System.out.println("도 단위를 입력");
        String province = keyboard.readLine();
        System.out.println("시 단위를 입력");
        String city = keyboard.readLine();
        System.out.println("구 단위를 입력");
        String district = keyboard.readLine();
        System.out.print("입력한 주소는 \"");
        System.out.println(province+" "+city+" "+district+"\"");
    }
}
