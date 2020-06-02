package LambdaTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndCollectors {
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "C++","php","java");
        List<String> listResult = language.collect(Collectors.toList());
        System.out.println(listResult);
        listResult.forEach(System.out::println);
    }
}