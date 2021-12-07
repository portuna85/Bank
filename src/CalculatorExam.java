public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        double result1 = myCalc.plus(5.4,7.6);
        System.out.println(result1);

        byte x = 10;
        byte y = 7;
        double result2 = myCalc.divide(x,y);
        System.out.println(result2);

        myCalc.powerOff();
    }
}
