package Cal.sec15;

public class CarService {
    @Car
    public void method1(){
        System.out.println("실행내용^:^");
    }

    @Car("*")
    public void method2(){
        System.out.println("실행내용:)");
    }

    @Car(value="#", number=20)
    public void method3(){
        System.out.println("실행내용^:^");
    }
}

