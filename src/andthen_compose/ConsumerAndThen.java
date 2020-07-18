package andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
            System.out.println("ConsumerA:" + m.getName());
        };

        Consumer<Member> consumerB = (m) -> {
            System.out.println("ConsumerA:" + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);

        consumerAB.accept(new Member("홍길동", "hong",null));
    }
}
