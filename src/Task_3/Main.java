package Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<TrainCar> trainCars = new ArrayList<>();

        trainCars.add(new TrainCar(50, 20));
        trainCars.add(new TrainCar(40, 15));
        trainCars.add(new TrainCar(30, 10));

        PassengerTrain passengerTrain = new PassengerTrain(trainCars);

        System.out.println("Total passengers: " + passengerTrain.getTotalPassengers());

        System.out.println("Total baggage: " + passengerTrain.getTotalBaggage());

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the minimum number of passengers: ");
        int minPassengers = in.nextInt();

        System.out.print("Enter the maximum number of passengers: ");
        int maxPassengers = in.nextInt();

        List<TrainCar> selectedCars = passengerTrain.findTrainCars(minPassengers, maxPassengers);

        System.out.println("Selected train cars: ");

        for (TrainCar car : selectedCars) {
            System.out.println("Passengers: " + car.getPassengerCount() + ", Baggage: " + car.getBaggageCount());
        }
    }
}
