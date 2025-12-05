package enumeration.ex2;

public class EnumRefMain2 {
    public static void main(String[] args) {

            int price = 10000;
            DiscountService2 discountService = new DiscountService2();
            int basicDiscount = discountService.discount(Grade2.BASIC, price);

            int goldDiscount = discountService.discount(Grade2.GOLD, price);

            int diamondDiscount = discountService.discount(Grade2.DIAMOND, price);


        System.out.println("basicDiscount = " + basicDiscount);
        System.out.println("goldDiscount = " + goldDiscount);
        System.out.println("diamondDiscount = " + diamondDiscount);



//            for(Grade2 grade : Grade2.values()){
//                int discount = discountService.discount(grade, price);
//                System.out.println(grade + "������ " + discount + "��� ������������.");
//            }


    }
}
