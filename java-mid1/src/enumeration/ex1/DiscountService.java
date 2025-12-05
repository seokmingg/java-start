package enumeration.ex1;

public class DiscountService {
    public double getDiscountRate(Grade grade, int price) {
           double discountRate = 0.0;
        switch (grade) {
            case BASIC:
                discountRate = 0.05;
                break;
            case GOLD:
                discountRate = 0.10;
                break;
            case DIAMOND:
                discountRate = 0.15;
                break;
        }
        return discountRate*price;
    }
}
