package Section_8.dev.abstaction;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       if(speed == "slow"){
           System.out.println(getExplicitType() +" Dog is Walking");
       }else {
           System.out.println(getExplicitType()+" normal");
       }
    }

    @Override
    public void makeNoise() {
         if(type == "Wolf"){
             System.out.println("Howling");
         }else {
             System.out.print("Woof!");
         }
    }
}
