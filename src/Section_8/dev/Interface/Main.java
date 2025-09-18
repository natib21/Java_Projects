package Section_8.dev.Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable trackable = bird;
        animal.move();
        inFlight(flier);
        inFlight(new Jet());

        Trackable trackable1 = new Truck();
        trackable1.track();

        double KmsTraveled = 100;
        double milesTraveled = KmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", KmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> flights = new LinkedList<>();
        flights.add(bird);
        List<FlightEnabled> flights1 = new ArrayList<>();
        triggerFlier(flights);
        flyFlier(flights);
        landFliers(flights);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.tekeOff();
        flier.fly();
        if (flier instanceof Trackable t) {
            t.track();
        }
        flier.land();
        System.out.print("_".repeat(10));
    }

    private static void triggerFlier(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.tekeOff();
        }
    }

    private static void flyFlier(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.fly();
        }
    }
}
