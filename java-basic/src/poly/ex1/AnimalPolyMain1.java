package poly.ex1;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    public static void soundAnimal(Animal animal) {
        System.out.println("동물소리테스트시작");
        animal.sound();

        System.out.println("동물소리테스트종료");
    }
}
