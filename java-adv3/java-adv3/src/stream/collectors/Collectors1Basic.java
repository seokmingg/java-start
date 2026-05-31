package stream.collectors;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {
    public static void main(String[] args) {

        List<String> list = Stream.of("Java", "Spring", "Jpa")
//                .collect(Collectors.toList());// 수정 가능 리스트 반환
                .toList();// 수정 가능 리스트 반환
        System.out.println("list = " + list);



    }
}
