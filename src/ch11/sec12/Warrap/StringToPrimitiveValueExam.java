package ch11.sec12.Warrap;

public class StringToPrimitiveValueExam {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("20.33");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
    }
}
