package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String , Integer> studentMap = new HashMap<>();


        //학생 성적 데이터 추가
        studentMap.put("studentA", 95);
        studentMap.put("studentB", 85);
        studentMap.put("studentC", 75);
        studentMap.put("studentD", 95);
        studentMap.put("studentE", 55);
        System.out.println(studentMap);

        //특정학생의 값 조회
        Integer result = studentMap.get("studentA");
        System.out.println("studentA의 성적: " + result);

        //keset 활용
        Set<String> keySet = studentMap.keySet();
        for(String key : keySet){
            System.out.println(key + " : " + studentMap.get(key));
        }
    }
}
