package enumeration.ex3;

public class EnumRefMain4 {
    public static void main(String[] args) {
        int price=100000;
        Grade3[] grades=Grade3.values();

        for (Grade3 grade:grades){
        printDiscount(grade,price);

        }

    }


    private static void printDiscount(Grade3 grade, int price){
        System.out.println(grade.name() + "등급의할인금액 " + grade.discount(price) + "원");
    }

}
