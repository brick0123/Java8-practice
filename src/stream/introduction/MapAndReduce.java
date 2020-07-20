package stream.introduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 30),
                new Student("신용권", 20),
                new Student("유미선", 10)
        ); 
        
//        list.stream().mapToInt(s -> s.getScore());
        
        double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
        
        System.out.println("평균 점수 : " + avg);
        
    }

}
