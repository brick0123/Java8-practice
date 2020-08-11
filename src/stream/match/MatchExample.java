package stream.match;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 최종 연산자
public class MatchExample {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result1 = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수  ? : "+ result1);

        result1 = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
        System.out.println("하나라도 3의 배수 ? : " + result1);

        result1 = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없는가 ? : " + result1);
    }
}
