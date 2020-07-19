package functional_interface.constructor_references.andthen_compose;

import java.util.function.Function;

public class FunctionAndThen {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;


        functionA = m -> m.getAddress();
        functionB = a -> a.getCity();

        functionAB = functionA.andThen(functionB);

        String city = functionAB.apply(new Member("홍길동","hing", new Address("한국","서울")));

        System.out.println("거주 도시 " + city);

        functionAB =  functionB.compose(functionA);
        city = functionAB.apply(new Member("홍길동","hing", new Address("한국","서울")));

        System.out.println("거주 도시 " + city);
    }
}