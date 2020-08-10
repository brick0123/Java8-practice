package optional;

import stream.OnlineClass;
import sun.security.krb5.internal.KDCOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<Online> springClasses = new ArrayList<>();
        springClasses.add(new Online(1, "spring boot", true));
        springClasses.add(new Online(2, "spring data jap", true));
        springClasses.add(new Online(3, "spring mvc", false));
        springClasses.add(new Online(4, "spring core", false));
        springClasses.add(new Online(5, "reset api development", false));

        Optional<Online> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = optional.isPresent();
        System.out.println(present);

        if (optional.isPresent()) {
            Online onlineClass = optional.get();
            System.out.println(onlineClass.getTitle());
        }

        // 밑에 코드로 짧게 가능
        optional.ifPresent(oc -> System.out.println(oc.getTitle())); // 값이 있으면 ()실행
        // Consumer

        // orElse
        Optional<Online> optional2 = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();
        Online online = optional2.orElse(createNewClasses());
        // orElse :  createNewClass는 무조건 실행 (값이 있더라도)
        // Supplier

        Online online2 = optional2.orElseGet(() -> createNewClasses());
        Online online3 = optional2.orElseGet(OptionalTest::createNewClasses);
        // orElseGet : 값이 없을 경우만 실행됨

        Online online4 = optional2.orElseThrow(IllegalArgumentException::new);


    }

    private static Online createNewClasses() {
        System.out.println("creating new online class");
        return new Online(10, "New class", false);
    }
}
