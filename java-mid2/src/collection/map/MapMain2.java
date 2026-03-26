package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap =new HashMap<>();


        //학생 성적 데이터 추가
        studentMap.put("studentA", 95);
        System.out.println(studentMap);

        studentMap.put("studentA", 85);
        System.out.println(studentMap);



    }
}
