package final_2021_2.final_1;

import java.io.*;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("영어를 우리말로 번역해드립니다.");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(reader);
		try {
			String input = keyboard.readLine();
			if (input.equals("yes")) System.out.println("그렇습니다.");
			else if (input.equals("no")) System.out.println("아닙니다.");
			else System.out.println("저는 yes와 no 밖에 모릅니다.");
		}
		catch (IOException e) {
			System.out.println("오류 발생.");
		}
	}
}