package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        System.out.println("parent => parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("\nchild => child");
        Child child = new Child();
        child.childMethod();

        System.out.println("Parent => child");
        Parent parent2 = new Child();
        parent2.parentMethod();

    }
}
