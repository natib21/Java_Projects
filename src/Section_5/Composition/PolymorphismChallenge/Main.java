package Section_5.Composition.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborgin");
        runRace(car);


        Car ferari = new GasPoweredCar("Ferrari ",15.4, 6);
        runRace(ferari);
    }
    public static void runRace(Car car){
        car.StartEngine();
        car.drive();
    }
}
