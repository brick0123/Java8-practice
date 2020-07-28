package stream.pipelines;

import java.util.Arrays;
import java.util.List;


// 중간 처리 메소드와 최종 처리 메소드 차이
// 중간 처리 - 리턴 타입이 스트림
// 최종 처리 - 리턴 타입이 기본 타입이거나 OptionalXXX
public class StreamPipelines {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("신용권", Member.MALE, 45),
                new Member("박수미", Member.FEMALE, 27)
        );

        double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();

        System.out.println("남자 평균 나이 :" + ageAvg);
    }
}

class Member{
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    public Member(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
