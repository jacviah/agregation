package by.jacviah.jc1.agregation_country.entity;

public class District {

    private City center;
    private double area;

    public District(City center, double area) {
        this.center = center;
        this.area = area;
    }

    public City getCenter() {
        return center;
    }

    public void setCenter(City center) {
        this.center = center;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (Double.compare(district.area, area) != 0) return false;
        return center != null ? center.equals(district.center) : district.center == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = center != null ? center.hashCode() : 0;
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "center=" + center +
                ", area=" + area +
                '}';
    }
}
