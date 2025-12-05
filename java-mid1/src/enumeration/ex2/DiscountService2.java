package enumeration.ex2;

public class DiscountService2 {
    public int discount(Grade2 grade, int price){
        return grade.getDiscountRate()*price/100;
    }


}
