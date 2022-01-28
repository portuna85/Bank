package ch14.sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExam {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = (m) -> m.getAddrss();
        functionB = (m) -> m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("홍길동", "Hong", new Address("KOREA", "SEOUL"))
        );
        System.out.println("거주 도시 : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("홍길동", "Hong", new Address("KOREA", "SEOUL"))
        );
        System.out.println("거주 도시 : " + city);
    }
}