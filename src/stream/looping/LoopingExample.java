package stream.looping;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("[peek()을 마지막에 호출한 경우]");
        Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n));
        // 최종 연산자가 없으므로 실행 X

        System.out.println("최종 처리 메소드를 마지막에 호출한 경우");
        int sum = Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
        System.out.println(sum);
    }
}
