package Cal.sec15;

import java.lang.reflect.Method;
import java.security.Provider;

public class CarExam {
    public static void main(String[] args) {
        Method[] declaredMethod = CarService.class.getDeclaredMethods();

        for(Method method : declaredMethod){
            if(method.isAnnotationPresent(Car.class)) {
               Car carAnnotation = method.getAnnotation(Car.class);

                System.out.println("["+method.getName()+"]");
                for(int i=0;i<carAnnotation.number();i++){
                    System.out.print(carAnnotation.value());
                }
                System.out.println();

                try{
                    method.invoke(new CarService());
                } catch (Exception e) {}
                System.out.println();
            }
        }
    }
}