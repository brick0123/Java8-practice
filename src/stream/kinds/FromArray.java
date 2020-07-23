package stream.kinds;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArray {
    public static void main(String[] args) {
        String[] strArray = {"홍길동" , "신용권", "김미나"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(a -> System.out.println(a + " ,"));

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.println(a + ", "));
    }


}
