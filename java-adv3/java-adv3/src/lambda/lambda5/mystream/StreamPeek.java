package lambda.lambda5.mystream;

import java.util.List;
import java.util.stream.Stream;

public class StreamPeek {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        Stream<Integer> s1 = list.stream();
        System.out.println(s1.getClass().getName());
        // 출력: java.util.stream.ReferencePipeline$Head

        Stream<Integer> s2 = list.stream().filter(i -> i > 1);
        System.out.println(s2.getClass().getName());
        // 출력: java.util.stream.ReferencePipeline$2  (StatelessOp의 익명 클래스)

        Stream<Integer> s3 = list.stream().filter(i -> i > 1).map(i -> i * 10);
        System.out.println(s3.getClass().getName());
        // 출력: java.util.stream.ReferencePipeline$3
        
    }
}