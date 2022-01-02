package ch11.sec13.Random;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        int[] num = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            num[i] = random.nextInt(45) + 1;
            System.out.print(num[i] + " ");
        }
        int[] win = {4, 7, 8, 10, 27, 28};

        Arrays.sort(num);

        boolean result = Arrays.equals(num, win);

    }
}
