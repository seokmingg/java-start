package extends1.ex2;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("The electric car is moving silently.");
    }

    public  void  charge() {
        System.out.println("The electric car is charging.");
    }
}
