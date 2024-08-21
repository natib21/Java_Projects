package Section_5.Composition.PolymorphismChallenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void StartEngine (){
        System.out.println("Start Engine");
    }
    protected void runEngine(){
        System.out.println("run Engine");
    }
    public void drive(){
         System.out.println("Car -> driving, type is " + getClass().getSimpleName());
         runEngine();
    }

}
class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int Cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.Cylinder = cylinder;
    }

    @Override
    public void StartEngine() {
      System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n",Cylinder);
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
      System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }



    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}