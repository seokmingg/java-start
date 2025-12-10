package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
//        MyLinkedListV2 list = new MyLinkedListV2();
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
//마지막에 추가 //O(n)
        list.add("a");
        list.add("b");
        list.add("c");
//        list.add(3);

        System.out.println(list);
//첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d"); //O(1)
        System.out.println(list);
        System.out.println("첫 번째 항목 삭제");
        list.remove(0); //remove First O(1)
        System.out.println(list);
//중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1,"e"); //O(n)
        System.out.println(list);
        System.out.println("중간 항목 삭제");
        list.remove(1);//remove O(n)
        System.out.println(list);


        System.out.println("숫자");
        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        System.out.println("intList = " + intList);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
        System.out.println("intList = " + intList);
        Integer integer2 = intList.get(2);
        System.out.println("integer = " + integer2);
    }
}
