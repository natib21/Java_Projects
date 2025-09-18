package Section_8.Abstraction;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
      if(speed == "Slow"){
          System.out.println(getExplicitType() + "Dog is walking");
      }else {
          System.out.println(getExplicitType() + "it is not");
      }
    }
    @Override
    public void makeNoise() {
       if (type == "wolf"){
           System.out.println("Howling! ");
       }else {
           System.out.println("Woof!  ");
       }
    }
}
