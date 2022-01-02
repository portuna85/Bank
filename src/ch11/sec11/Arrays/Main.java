package ch11.sec11.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] num1 = new int[3][3];
        int[][] num2 = num1;
        int[][] num3 = num1.clone();
        int[][] num4 = Arrays.copyOf(num1, num1.length);
        int[][] num5 = new int[3][3];

        // 2차원 배열에 deepCopy
        for (int i = 0; i < num1.length; i++) {
            System.arraycopy(num1[i], 0, num5[i], 0, num1[i].length);
        }
        System.out.println();
    }
}