package Section_8.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("German Shepard","big",150));
        animals.add(new Dog("Pug","small",20));
        animals.add(dog);

        for(Animal val : animals){
            doAnimalStuff(val);
        }
    }


    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
    }


}
