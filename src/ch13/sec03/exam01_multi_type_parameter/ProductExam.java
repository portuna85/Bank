package ch13.sec03.exam01_multi_type_parameter;

public class ProductExam {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트TV");

        Tv tv = product1.getKind();
        String teModel = product1.getModel();

        System.out.println(tv + " " + teModel);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
