package Section_4.Inheritance;

public class Main {
    public static void main(String[] args) {
      Animal animal = new Animal("Generic Animal" , "Huge ", 400);
      doAnimalStuff(animal,"slow");

      Dog dog = new Dog();
      doAnimalStuff(dog,"fast");

       Dog yorkie = new Dog("Yorkie",15);
       doAnimalStuff(yorkie, "fast");

       Dog retriver = new Dog("Labrador Retriver",65,"Floppy","slow");
       doAnimalStuff(retriver,"slow");
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
