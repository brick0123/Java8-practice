package stream.introduction;

import java.util.ArrayList;
import java.util.List;

public class TestParallelStream {
    public static void main(String[] args) {

        List<Integer> names = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            names.add(new Integer(i));
        }

        long start = System.currentTimeMillis();
        names.parallelStream().map(s -> s + " " + Thread.currentThread().getName());
        long end = System.currentTimeMillis();

        System.out.println( "실행 시간 : " + ( end - start )/1000.0 );


        long start2 = System.currentTimeMillis();
        names.stream().map(s -> s + " " + Thread.currentThread().getName());
        long end2 = System.currentTimeMillis();

        System.out.println( "실행 시간 : " + ( end2 - start2 )/1000.0 );

    }
}
