package Section_8.dev.Interface;

public class Bird extends Animal implements FlightEnabled,Trackable{


    @Override
    public void move() {
     System.out.println("Bird move");
    }

    @Override
    public void tekeOff() {
        System.out.println(getClass().getSimpleName() +" Bird tekeOff");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() +" Bird landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() +" Bird flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +"  's coordinates recorded");
    }
}
