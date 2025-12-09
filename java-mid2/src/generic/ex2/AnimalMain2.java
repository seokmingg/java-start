package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal= new Animal("Generic Animal",0);
        Dog dog = new Dog("Dog",1);
        Cat cat = new Cat("Cat",2);


        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(animal);
        animalBox.setItem(dog);
        animalBox.setItem(cat);

        Animal findAnimal =  animalBox.getItem();
        System.out.println("findAnimal = " + findAnimal);
        System.out.println("findAnimal = " + findAnimal.getClass() );

    }
}
