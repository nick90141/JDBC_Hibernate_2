package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<TrainCar> trainCars;

    public Train(List<TrainCar> trainCars) {
        this.trainCars = trainCars;
    }

    public int getTotalPassengers() {
        int totalPassengers = 0;
        for (TrainCar car : trainCars) {
            totalPassengers += car.getPassengerCount();
        }
        return totalPassengers;
    }

    public int getTotalBaggage() {
        int totalBaggage = 0;
        for (TrainCar car : trainCars) {
            totalBaggage += car.getBaggageCount();
        }
        return totalBaggage;
    }

    public List<TrainCar> findTrainCars(int min, int max) {
        List<TrainCar> result = new ArrayList<>();
        for (TrainCar car : trainCars) {
            int passengers = car.getPassengerCount();
            if (passengers >= min && passengers <= max) {
                result.add(car);
            }
        }
        return result;
    }
}




