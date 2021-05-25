package methodreference;

import java.util.function.IntBinaryOperator;

public class MethodReferences {

    public static void main(String[] args) {
        IntBinaryOperator operator;


        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1: " + operator.applyAsInt(1, 2));

        operator = Calculator::staticMethod;
        System.out.println("결과 2: " + operator.applyAsInt(1, 2));

        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3: " + operator.applyAsInt(1, 2));

        operator = obj::instanceMethod;
        System.out.println("결과 4: " + operator.applyAsInt(1, 2));



    }
}
