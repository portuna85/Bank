package Example;

import java.util.Arrays;

public class SearchExam {
    public static void main(String[] args) {
        int scores[] = {99, 76, 85};
        //int index = Arrays.binarySearch(scores,99);
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores,85);
        System.out.println(index);
    }
}