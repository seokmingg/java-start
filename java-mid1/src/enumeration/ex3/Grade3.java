package enumeration.ex3;

public enum Grade3 {
    BASIC(60),GOLD(70),DIAMOND(80),VIP(90);

    private int discountRate;



    private Grade3(int discountRate){
        this.discountRate=discountRate;
    }


    public int getDiscountRate(){
        return discountRate;
    }



    public  int discount(int price){
        return discountRate*price/100;
    }
}
