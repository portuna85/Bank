package ch14.sec06.exam03_consturctor_referenc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExam {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply(("angel"));

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("신용훈", "angel");
    }
}
