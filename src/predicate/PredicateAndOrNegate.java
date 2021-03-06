package predicate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegate {
    public static void main(String[] args) {

        // 2의 배수를 검사
        IntPredicate predicateA = a -> a % 2 == 0;

        // 3의 배수를 검사
        IntPredicate predicateB = a -> a % 3 == 0;

        IntPredicate predicateAB;

        boolean result;

        // and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println(result);


        // or
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println(result);

        // neagate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println(result);

    }
}
