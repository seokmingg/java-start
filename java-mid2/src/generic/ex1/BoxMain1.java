package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();//생성시점에 t의 타입결정
        integerBox.setValue(123);
        System.out.println(integerBox.getValue());

        GenericBox<String> stringBox = new GenericBox<String>();//생성시점에 t의 타입결정
        stringBox.setValue("Hello Generic");
        System.out.println(stringBox.getValue());



        //타입추론 뒤에 <> 다이아몬드 연산자 아무것도안넘
        GenericBox<Double> doubleBox = new GenericBox<>();//생성시점에 t의 타입결정
        doubleBox.setValue(3.14);
        System.out.println(doubleBox.getValue());


        //rowType   제네릭이없는옜날거랑 호환할떄나쓰지 이렇게쓰면안된다
//        GenericBox rawBox = new GenericBox();//생성시점에 t의 타입결
        GenericBox<Object> rawBox = new GenericBox<>();//생성시점에 t의 타입결
        rawBox.setValue(100);//자동박싱

        System.out.println(rawBox.getValue());


    }



}
