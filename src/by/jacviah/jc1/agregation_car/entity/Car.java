package by.jacviah.jc1.agregation_car.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {

        private List<Wheel> wheelsList = new ArrayList<>();
        private Engine engine;
        private boolean isMove = false;
        private int fillUp;
        private String model;

    public Car(Wheel rightFront, Wheel leftFront, Wheel rightRear, Wheel leftRear, Engine engine, String model) {
        this.wheelsList.add(rightFront);
        this.wheelsList.add(leftFront);
        this.wheelsList.add(rightRear);
        this.wheelsList.add(leftRear);
        this.engine = engine;
        this.model = model;
    }

    public void stop() {
        this.isMove = false;
        System.out.println("Stop");
    }

    public void  turnIgnitionOff() {
        if (!isMove) {
            System.out.println("The ignition is off");
            this.engine.stopRunning();
        } else {
            System.out.println("Firstly stop the car");
        }
    }

    public void move() {
        this.engine.startRunning();
        this.isMove = true;
        System.out.println("Move");
    }

    public void fillUp(int litets) {
        if (!isMove) {
            this.fillUp = litets;
            System.out.println("Fill up " + litets);
        } else {
            System.out.println("Firstly stop the car");
        }
    }

    public void replaceTheWheel(int num) {
        if (!isMove) {
            System.out.println("Wheel " + num + " is replaced.");
        } else {
            System.out.println("Firstly stop the car");
        }
    }

    public void printModel() {
        System.out.println(this.model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (isMove != car.isMove) return false;
        if (fillUp != car.fillUp) return false;
        if (wheelsList != null ? !wheelsList.equals(car.wheelsList) : car.wheelsList != null) return false;
        if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;

    }

    @Override
    public int hashCode() {
        int result = wheelsList != null ? wheelsList.hashCode() : 0;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (isMove ? 1 : 0);
        result = 31 * result + fillUp;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelsList=" + wheelsList +
                ", engine=" + engine +
                ", isMove=" + isMove +
                ", fillUp=" + fillUp +
                ", model='" + model + '\'' +
                '}';
    }
}
