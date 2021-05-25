package function;

import java.util.function.Function;

public class FunctionAndThen {
    public static void main(String[] args) {
        Function<ConsumerMember, Address> functionA;
        Function<Address, String> functionB;
        Function<ConsumerMember, String> functionAB;


        functionA = m -> m.getAddress();
        functionB = a -> a.getCity();

        functionAB = functionA.andThen(functionB);

        String city = functionAB.apply(new ConsumerMember("홍길동","hing", new Address("한국","서울")));

        System.out.println("거주 도시 " + city);

        functionAB =  functionB.compose(functionA);
        city = functionAB.apply(new ConsumerMember("홍길동","hing", new Address("한국","서울")));

        System.out.println("거주 도시 " + city);
    }
}
