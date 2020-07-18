import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class Foo {
    public static void main(String[] args) {

        RunSomething runSomething = num -> num + 10;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        Pluse10 pluse10 = new Pluse10();
        System.out.println(pluse10.apply(10));

        Function<Integer, Integer> minuse10 = i -> i - 10;
        System.out.println(minuse10.apply(20));



        Foo foo = new Foo();
        foo.run();
    }
    void run(){
        final  int baseNumber = 10;

        // 로컬 클래스
        class  LocalClass{
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        integerConsumer.accept(20);

        // 람다
        IntConsumer printInt = i -> {
            System.out.println(i + baseNumber);
        };
        printInt.accept(10);
    }
}
