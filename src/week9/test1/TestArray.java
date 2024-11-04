package week9.test1;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        arr1[1] = 7;
        arr1[2] = arr1[1]+2;
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = arr1;

        System.out.println("arr2 출력");

        System.out.println(Arrays.toString(arr2));
    }
}
