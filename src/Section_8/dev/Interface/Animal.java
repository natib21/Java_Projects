package Section_8.dev.Interface;

enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void tekeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth {

    @Override
    public void achieveOrbit() {
        System.out.println("Achieved Orbit");
    }

    @Override
    public void tekeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void tekeOff();

    void land();

    void fly();

   static  FlightStages transtition (FlightStages s ){
       return s;
   };
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
