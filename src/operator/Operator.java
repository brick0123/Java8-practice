package operator;

import java.util.function.IntBinaryOperator;

public class Operator {
    private static int[] score = {92, 95, 87};

    public static int maxOfMin(IntBinaryOperator operator) {
        int result = score[0];

        for(int score : score)
            result = operator.applyAsInt(result, score);
        return result;
    }

    public static void main(String[] args) {
        // 최대값 얻기
        int max = maxOfMin(
                (a, b) -> {
                    if(a >= b) return a;
                    else return b;
                }
        );
        System.out.println("최대값 : " + max);

        int min = maxOfMin(
                (a, b) -> {
                    if(a >= b) return b;
                    else return a;
                }
        );
        System.out.println("최소값 : " + min);
    }

}