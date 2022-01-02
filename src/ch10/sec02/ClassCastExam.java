package ch10.sec02;


public class ClassCastExam {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        chageDog(dog);
        Cat cat = (Cat) animal;
        chageDog(cat);

        System.out.println(dog);
        System.out.println(cat);
    }

    public static void chageDog (Animal animal){
       if(animal instanceof Dog) {
           Dog dog = (Dog) animal;
           System.out.println("변환 완료");
       } else {
           System.out.println("변환 어려움");
       }
    }
}


class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}