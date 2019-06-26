package by.jacviah.jc1.agregation_car.entity;

public class Wheel {
    private int pressure;
    private boolean isFlat;

    public Wheel() {
        this.pressure = 2;
        this.isFlat = false;
    }

    public Wheel(int pressure, boolean isFlat) {
        this.pressure = pressure;
        this.isFlat = isFlat;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        if (pressure != wheel.pressure) return false;
        return isFlat == wheel.isFlat;

    }

    @Override
    public int hashCode() {
        int result = pressure;
        result = 31 * result + (isFlat ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", isFlat=" + isFlat +
                '}';
    }
}
