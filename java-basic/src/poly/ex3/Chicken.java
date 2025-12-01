package poly.ex3;

public class Chicken extends AbstractAnimal implements  Fly {

    @Override
    public void fly() {
        System.out.println("The chicken is flying short distances");
    }

    @Override
    public void sound() {
        System.out.println("Cluck Cluck 꽥꽥");
    }
}
