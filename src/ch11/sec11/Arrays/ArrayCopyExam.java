package ch11.sec11.Arrays;

import java.util.Arrays;

public class ArrayCopyExam {
    public static void main(String[] args) {
        char[] arr1 = {'J', 'A', 'V', 'A'};

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr2);
        System.out.println(arr2.length);

        char[] arr3 = Arrays.copyOfRange(arr1,1,3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1,0,arr4,0,arr1.length);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println("arr[" + i + "]" + arr4[i]);
        }
    }
}