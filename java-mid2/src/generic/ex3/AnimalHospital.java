package generic.ex3;

import generic.animal.Animal;


public class AnimalHospital<T extends Animal> {


    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public  void  checkup(){
        System.out.println("동물이름 "+animal.getName());
        System.out.println("동물크기 "+animal.getSize());
        animal.sound();
    }

    public T getBigger(T target){
        return animal.getSize()>target.getSize()?target:animal;
    }


}
