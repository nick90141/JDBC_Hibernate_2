package Task_2;

import Task_3.Train;
import Task_3.TrainCar;

import java.util.ArrayList;
import java.util.List;

public class TrainDAO {
    private List<Train> trains;

    public TrainDAO(List<Train> trains) {
        this.trains = trains;
    }

    public int getTotalPassengers() {
        int totalPassengers = 0;
        for (Train train : trains) {
            totalPassengers += train.getTotalPassengers();
        }
        return totalPassengers;
    }

    public int getTotalBaggage() {
        int totalBaggage = 0;
        for (Train train : trains) {
            totalBaggage += train.getTotalBaggage();
        }
        return totalBaggage;
    }

    public List<TrainCar> findTrainCars(int min, int max) {
        List<TrainCar> result = new ArrayList<>();
        for (Train train : trains) {
            List<TrainCar> trainCars = train.findTrainCars(min, max);
            result.addAll(trainCars);
        }
        return result;
    }

}
