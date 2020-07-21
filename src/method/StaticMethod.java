package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StaticMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jinho");
        names.add("toby");
        names.add("keesun");

        names.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase);
        names.forEach(System.out::println);


        names.sort(compareToIgnoreCase.reversed());
        System.out.println();

        names.forEach(System.out::println);


        names.removeIf(s -> s.startsWith("t"));
        names.forEach(System.out::println);

        Stream<String> stream = names.stream().map(String::toUpperCase);
        stream.forEach(System.out::println);

    }
}
