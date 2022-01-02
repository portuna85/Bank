package ch11.sec11.Arrays;

import java.util.Arrays;

public class EqualsExam {
    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};

        System.out.println("[ 얕은 복제후 비교 ]");
        int[][] cloned1 = Arrays.copyOf(original, original.length);
        System.out.println(original.equals(cloned1));
        System.out.println(Arrays.equals(original, cloned1));
        System.out.println(Arrays.deepEquals(original, cloned1));

        System.out.println("[ 깊은 복제후 비교 ]");
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);

        System.out.println("cloned2 = " + original.equals(cloned2));
    }
}
