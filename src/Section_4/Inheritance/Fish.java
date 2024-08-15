package Section_4.Inheritance;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(){
        super("england","small",20);
    }
    public Fish(String type,  double weight, int gills, int fins) {
        super(type,"small" , weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("muscle moving");
    }
    private void moveBackFin(){
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if(speed == "fast") moveBackFin();

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
