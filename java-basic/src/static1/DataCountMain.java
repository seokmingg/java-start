package static1;

public class DataCountMain {
    public static void main(String[] args) {
        Data1 d1 = new Data1("Alice");
        Data1 d2 = new Data1("Bob");
        Data1 d3 = new Data1("Charlie");

        System.out.println("Total instances created: " + Data1.count);
    }
}
