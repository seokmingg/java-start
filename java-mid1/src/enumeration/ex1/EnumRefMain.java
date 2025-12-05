package enumeration.ex1;

public class EnumRefMain {
    public static void main(String[] args) {


        int price = 10000;
        DiscountService service = new DiscountService();
        double basicDiscount = service.getDiscountRate(Grade.BASIC, price);
        double goldDiscount = service.getDiscountRate(Grade.GOLD, price);
        double diamondDiscount = service.getDiscountRate(Grade.DIAMOND, price);
        System.out.println("Basic Discount: " + basicDiscount);
        System.out.println("Gold Discount: " + goldDiscount);
        System.out.println("Diamond Discount: " + diamondDiscount);

    }
}
