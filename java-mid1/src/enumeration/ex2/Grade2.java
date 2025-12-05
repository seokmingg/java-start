package enumeration.ex2;

public enum Grade2 {
    BASIC(50),GOLD(60),DIAMOND(70);

    private int discountRate;



    private Grade2(int discountRate){
        this.discountRate=discountRate;
    }


    public int getDiscountRate(){
        return discountRate;
    }
}
