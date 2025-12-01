package poly.ex3;



public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();


        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);


//        flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);

    }


    //공통
    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리테스트시작");
        animal.sound();
        System.out.println("동물소리테스트종료");

    }

    //fly 인터페이스 전용
    public static void flyAnimal(Fly flyAnimal) {
        System.out.println("동물비행테스트시작");
        flyAnimal.fly();
        System.out.println("동물비행테스트종료");
    }





}