package enumeration.ex3;

public class EnumRefMain3 {
    public static void main(String[] args) {

            int price = 10000;

            int basicDiscount = Grade3.BASIC.discount(price);
            int goldDiscount = Grade3.GOLD.discount(price);
            int diamondDiscount = Grade3.DIAMOND.discount(price);

             System.out.println("basicDiscount = " + basicDiscount);
             System.out.println("goldDiscount = " + goldDiscount);
             System.out.println("diamondDiscount = " + diamondDiscount);



//            for(Grade2 grade : Grade2.values()){
//                int discount = discountService.discount(grade, price);
//                System.out.println(grade + "������ " + discount + "��� ������������.");
//            }


    }
}
