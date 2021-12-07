package Cal.sec10;

public class CalcExam {
    public static void main(String[] args) {
        Calc myCalc = new Calc();
        double result1 = 10*10*myCalc.pi;
        int result2 = Calc.plus(24,5);
        int result3 = Calc.minus(24,6);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
