package ch06.sec08.exam03_method_declaration;

public class ComputerExam {
    public static void main(String[] args) {
        Computer computer = new Computer();
        int[] values = {5, 24, 6};
        int result1 = computer.sum1(values);

        System.out.println(result1);

        int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result2 = computer.sum2(values1);
        System.out.println(result2);
    }
}
