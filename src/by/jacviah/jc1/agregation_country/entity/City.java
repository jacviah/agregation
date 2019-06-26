package by.jacviah.jc1.agregation_country.entity;

public class City {

    private String name;
    private boolean isCapital;
    private boolean isRegionalCenter;
    private boolean isDistrictCenter;
    private double area;

    public City(String name, boolean isCapital, boolean isRegionalCenter, boolean isDistrictCenter, double area) {
        this.name = name;
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
        this.isDistrictCenter = isDistrictCenter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        isRegionalCenter = regionalCenter;
    }

    public boolean isDistrictCenter() {
        return isDistrictCenter;
    }

    public void setDistrictCenter(boolean districtCenter) {
        isDistrictCenter = districtCenter;
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

        City city = (City) o;

        if (isCapital != city.isCapital) return false;
        if (isRegionalCenter != city.isRegionalCenter) return false;
        if (isDistrictCenter != city.isDistrictCenter) return false;
        if (Double.compare(city.area, area) != 0) return false;
        return name != null ? name.equals(city.name) : city.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isCapital ? 1 : 0);
        result = 31 * result + (isRegionalCenter ? 1 : 0);
        result = 31 * result + (isDistrictCenter ? 1 : 0);
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", isCapital=" + isCapital +
                ", isRegionalCenter=" + isRegionalCenter +
                ", isDistrictCenter=" + isDistrictCenter +
                ", area=" + area +
                '}';
    }
}
