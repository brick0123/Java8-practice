package function;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("자바", 60, 100)
    );

    public static void printString(Function<Student, String> function) {
        for(Student student : list)
            System.out.print(function.apply(student) + " ");

        System.out.println();
    }

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;

        for(Student student : list)
            sum += function.applyAsInt(student);

        double avg = (double)sum / list.size();

        return avg;
    }


    public static void main(String[] args)throws IOException {
        double englishAvg = avg( t -> t.getEnglishScore() );
        System.out.println("영어 평균 점수 : " + englishAvg);

        double mathAvg = avg(t -> t.getMathScore() );
        System.out.println("수학 평균 점수 : " + mathAvg);
    }



}

