package poly.ex2;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void move() {
        System.out.println("The cat walks gracefully");
    }
}
