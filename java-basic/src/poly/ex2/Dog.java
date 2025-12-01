package poly.ex2;

public class Dog implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void move() {
        System.out.println("The dog runs on all fours");
    }
}
