package Section_8.dev.Interface;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +"  's coordinates recorded");
    }
}
