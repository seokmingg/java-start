package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstatnceVar = 30;

    public Printer proccess(int parmVar) {
        int localVar = 1;//지역 변수는 스택 영역이 종료되는 순간 함께 제거된다.
        //localVar=3;    //지역변수는 final 특성을 가진다. ( 사실상 final) 바뀌면안됨규칙임
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value: " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar: " + localVar);
                System.out.println("parmVar: " + parmVar);
                System.out.println("outInstatnceVar: " + outInstatnceVar);


            }
        }



        LocalPrinter localPrinter = new LocalPrinter();
       // localPrinter.print(); 를 여기서 실행하지 않고 Printer 인터페이스로 반환한다.

        //만약 ㅣlocalVar의 값을 변경한다면
        //localVar=3; //에러발생java: local variables referenced from an inner class must be final or effectively final
        return  localPrinter;

    }


    public static void main(String[] args) {
        LocalOuterV4 localOuterV3 = new LocalOuterV4();
        Printer printer = localOuterV3.proccess(2);

        //printer.print를 나중에 실행한다. process의 스택프레임이 사라진 이후에 실행
        printer.print();



        //필드확인
        System.out.println("===================");
        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = "+field);
        }


    }


}