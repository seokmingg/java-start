package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal= new Animal("Generic Animal",0);
        Dog dog = new Dog("Dog",1);
        Cat cat = new Cat("Cat",2);


        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(dog);
        Dog findDog = dogBox.getItem();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.setItem(cat);
        Cat findCat = catBox.getItem();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(animal);
        Animal findAnimal = animalBox.getItem();
        System.out.println("findAnimal = " + findAnimal);





    }



}
