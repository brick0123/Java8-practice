package stream.reduce;

import function.Student;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92, 82),
                new Student("유재식", 85, 90),
                new Student("안철수", 74, 80)
        );

        int sum = studentList.stream()
                .mapToInt(Student::getEnglishScore)
                .peek(System.out::println)
                .sum();

        int sum2 = studentList.stream()
                .mapToInt(Student::getEnglishScore)
                .reduce((a , b) -> a + b)
                .getAsInt();

        int sum3 = studentList.stream()
                .mapToInt(Student::getEnglishScore)
                .reduce(0, (a , b) -> a + b);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
