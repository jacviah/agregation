package by.jacviah.jc1.agregation_car.entity;

public class Engine {
    private int power;
    private boolean isRunning;

    public Engine(int power) {
        this.power = power;
        this.isRunning = false;
    }

    public int getPower() {
        return power;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void startRunning() {
        isRunning = true;
        System.out.println("Engine is running");
    }

    public void stopRunning() {
        isRunning = false;
        System.out.println("Engine is off");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return isRunning == engine.isRunning;

    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (isRunning ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", isOn=" + isRunning +
                '}';
    }
}
