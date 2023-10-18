package Task_3;

import java.util.List;

public class PassengerTrain extends Train {

    public PassengerTrain(List<TrainCar> trainCars) {
        super(trainCars);

    }

    public void addTrainCar(TrainCar trainCar) {
        this.getTrainCars().add(trainCar);
    }
}