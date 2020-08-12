package stream.collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("신용권", 10, Student.Sex.MALE),
                new Student("박수미", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(
                        () -> new MaleStudent(),
                        (r, t) -> r.accumulate(t), // r == Supplier Malestudent,  t == 필터링 된 값
                        (r1, r2) -> r1.combine(r2) // 병렬처리에서 처리함, 병렬처리가 아니더라도 적어야됨
                );
        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
