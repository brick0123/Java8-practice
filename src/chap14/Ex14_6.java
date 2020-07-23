package chap14;

import java.io.File;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Stream;

public class Ex14_6 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java")};
        
        Stream<File> fileStream = Stream.of(fileArr);
        // map()으로 Stream<File> Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        System.out.println();

        fileStream = Stream.of(fileArr); // 스트림을 다시 생성

        fileStream.map(File::getName)       // Stream<File> -> Stream<String>
                .filter(s -> s.indexOf('.') != -1)  // 확장자가 없는 것은 제외
                .map(s -> s.substring(s.indexOf('.') + 1))
                .map(String::toUpperCase)           // 모두 대문자로 변환
                .distinct()                         // 중복 제거
                .forEach(System.out::print);

        System.out.println();
        int a = 5;
        OptionalInt test = OptionalInt.of(a);
        System.out.println(test.getAsInt());
        
    }

    public static void copy(){
        System.out.println("hello");
    }
    public static void pluse(){
        System.out.println("hello");
    }



}
