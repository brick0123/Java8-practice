package stream.kinds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContent {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/stream/kinds/linedata.txt");
        Stream<String> stream;

        // File.lines() 메소드 이용
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        stream.close();
        System.out.println();

        // BufferedReader의 line() 메소드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
        stream.close();
        System.out.println();

    }
}
