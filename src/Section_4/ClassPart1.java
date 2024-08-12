package Section_4;

public class ClassPart1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Carrera");
        car.setMake("porsche");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("Make "+car.getMake() );
        System.out.println("Model "+car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setModel("Carrera");
        targa.setMake("tesla");
        targa.setDoors(4);
        targa.setConvertible(false);
        targa.setColor("black");

        targa.describeCar();
    }
}
