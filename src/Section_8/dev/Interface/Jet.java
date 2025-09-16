package Section_8.dev.Interface;

public class Jet implements Trackable,FlightEnabled{
    @Override
    public void tekeOff() {
        System.out.println("\n"+getClass().getSimpleName() +" tekeOff\n");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() +"  landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() +"  flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +"  's coordinates recorded");
    }
}

