package Section_5.Composition.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborgin");
        runRace(car);


        Car ferari = new GasPoweredCar("Ferrari ",15.4, 6);
        runRace(ferari);
        Car tesla = new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(tesla);
    }
    public static void runRace(Car car){
        car.StartEngine();
        car.drive();
    }
}
