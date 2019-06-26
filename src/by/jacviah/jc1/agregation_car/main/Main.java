package by.jacviah.jc1.agregation_car.main;


import by.jacviah.jc1.agregation_car.entity.Car;
import by.jacviah.jc1.agregation_car.entity.Engine;
import by.jacviah.jc1.agregation_car.entity.Wheel;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Engine(200), "Audi A4");

        car.move();
        car.fillUp(50);
        car.replaceTheWheel(3);
        car.stop();
        car.turnIgnitionOff();
        car.fillUp(50);
        car.replaceTheWheel(3);
        car.printModel();
    }
}
