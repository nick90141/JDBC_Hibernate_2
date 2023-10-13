package Task_2;

import Task_3.PassengerTrain;
import Task_3.Train;
import Task_3.TrainCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();

        List<TrainCar> trainCars1 = new ArrayList<>();
        trainCars1.add(new TrainCar(50, 20));
        trainCars1.add(new TrainCar(40, 15));
        trainCars1.add(new TrainCar(30, 10));
        trains.add(new PassengerTrain(trainCars1));

        TrainDAO trainDAO = new TrainDAO(trains);

        System.out.println("Total passengers: " + trainDAO.getTotalPassengers());
        System.out.println("Total baggage: " + trainDAO.getTotalBaggage());

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the minimum number of passengers: ");
        int minPassengers = in.nextInt();

        System.out.print("Enter the maximum number of passengers: ");
        int maxPassengers = in.nextInt();

        List<TrainCar> selectedCars = trainDAO.findTrainCars(minPassengers, maxPassengers);

        System.out.println("Selected train cars: ");

        for (TrainCar car : selectedCars) {
            System.out.println("Passengers: " + car.getPassengerCount() + ", Baggage: " + car.getBaggageCount());
        }
    }
}