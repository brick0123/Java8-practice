package function;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<ConsumerMember> consumerA = (m) -> {
            System.out.println("ConsumerA:" + m.getName());
        };

        Consumer<ConsumerMember> consumerB = (m) -> {
            System.out.println("ConsumerA:" + m.getId());
        };

        Consumer<ConsumerMember> consumerAB = consumerA.andThen(consumerB);

        consumerAB.accept(new ConsumerMember("홍길동", "hong",null));
    }
}
