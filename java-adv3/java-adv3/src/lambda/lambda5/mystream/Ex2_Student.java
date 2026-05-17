package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2_Student {
    public static void main(String[] args) {
// 점수가 80점 이상인 학생의 이름을 추출해라.
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );
        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);
        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
        List<String> streamResult = st(students);
        System.out.println("streamResult = " + streamResult);


    }

    private static List<String> direct(List<Student> students) {
        List<String> highScoreNames = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                String name = student.getName();
                highScoreNames.add(name);
            }
        }
        return highScoreNames;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> filteredList = GenericFilter.filter(students, s -> s.getScore() >= 80);
        return GenericMapper.map(filteredList, s -> s.getName());
    }

    private static List<String> st(List<Student> students) {

        List<String> collect = students.stream()
                .filter(s -> s.getScore() >= 80)
//                .map(s -> s.getName())
                .map(Student::getName)
                .collect(Collectors.toList());
        return collect;

    }
}