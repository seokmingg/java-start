package enumeration.ex1;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        //모든 enum 상수를 배열로 반환
       Grade[] values = Grade.values();
        System.out.println("values="+ Arrays.toString(values));

        for (Grade grade : values) {
            System.out.println(grade.name()+" : "+grade.ordinal());
        }





    }
}
