package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<OlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OlineClass(1, "spring boot", true));
        springClasses.add(new OlineClass(2, "spring data jap", true));
        springClasses.add(new OlineClass(3, "spring mvc", false));
        springClasses.add(new OlineClass(4, "spring core", false));
        springClasses.add(new OlineClass(5, "reset api development", false));


        System.out.println("== spring으로 시작하는 수업 ==");
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .forEach(oc -> System.out.println(oc.getId()));


        System.out.println("close 되지 않은 수업");
        springClasses.stream()
                .filter(oc -> !oc.isClosed())       // 12 버전부터는 Predicate.not(OnlineClass::iseCLosed)
                .forEach(oc -> System.out.println(oc.getId()));
        System.out.println("수업 이름만 모아서 스트림 만들기");

        List<OlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OlineClass(6, "The Java, Test", true));
        javaClasses.add(new OlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OlineClass(8, "The Java, 8 to 11", true));

        List<List<OlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);


        System.out.println("두 수업 목록에 들어있는 모둔 수업 아이디 출력");
        // TODO

        System.out.println();
    }
}
