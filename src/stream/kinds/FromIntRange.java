package stream.kinds;

import java.util.stream.IntStream;

public class FromIntRange {
    public static int sum;

    public static void main(String[] args) {
//        int sum;
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);

        System.out.println("총합");

    }

}
