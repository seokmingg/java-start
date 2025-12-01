package poly.ex2;


public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        InterfaceAnimal [] animals = {dog, cat};

        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
        }
    }


    public static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물소리테스트시작");
        animal.sound();
        System.out.println("동물소리테스트종료");

    }

}
