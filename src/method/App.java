package method;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi;
        System.out.println(hi.apply("홍길동"));

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("백기선"));

        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting ng = newGreeting.get();

        Function<String, Greeting> functionGreeting = Greeting::new;
        Greeting gt = functionGreeting.apply("유재석");
        System.out.println(gt.getName());


        String[] names = {"keesun", "toby", "jinho"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Arrays.sort(names, String::compareToIgnoreCase);

    }
}
