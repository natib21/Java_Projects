package Section_8.dev.abstaction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("German Shepard","big",150);
        animals.add(new Dog("Bull Dog","big",200));
        animals.add(new Dog("England Shepard","small",130));
        animals.add(new Fish("Golden fish","big",300));
        animals.add(dog);
        animals.add(new Horse("Clydesdale","large",1000));
        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if(animal instanceof Mammal el) {
                el.shedHair();
            }
        }
    }
   private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
   }


}
