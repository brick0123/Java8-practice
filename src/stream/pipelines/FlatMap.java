package stream.pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java8 lamda", "stream mapping");
        inputList1.stream().map(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);
//        Stream<String> st = inputList1.stream().map(data -> data.split(" "));
        inputList1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
        inputList2.stream().flatMapToInt(data -> {String[] strArray = data.split(",");
                                                    int[] intArr = new int[strArray.length];
                                                    for(int i = 0; i < strArray.length; i++){
                                                        intArr[i] = Integer.parseInt(strArray[i].trim());
                                                    }
                                                    return Arrays.stream(intArr);
        }).forEach(System.out::println);

    }

}