package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> names=  List.of("Apple", "Banana", "Berry","Tomato");


        //b로 시작하는이름만 필터후 대문자로 바꿔서 리스트수집
        Stream<String> stream = names.stream();
        List<String> result = stream.filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("result = " + result);


        names.stream()
                .filter(name->name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);



    }
}
