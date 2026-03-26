package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());



        /*
        *
        * HashMap` : 입력한 순서를 보장하지 않는다.
            `LinkedHashMap` : 키를 기준으로 입력한 순서를 보장한다.
        `TreeMap` : 키 자체의 데이터 값을 기준으로 정렬한다.
        * */
    }

    private static void run(Map<String,Integer> map) {
        System.out.println("map =" + map.getClass());
        map.put("1",10);
        map.put("2",10);
        map.put("3",10);
        map.put("4",10);
        map.put("C",10);


        Set<String> keySet1 = map.keySet();
        Iterator<String> iterator = keySet1.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));

        }
        System.out.println("-----------------------------");

    }



}
