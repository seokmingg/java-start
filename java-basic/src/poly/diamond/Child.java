package poly.diamond;

public class Child implements  InterfaceA,InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }

    @Override
    public void methodCommon() {
        System.out.println("Common method implementation");
    }
}
