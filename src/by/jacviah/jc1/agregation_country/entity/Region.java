package by.jacviah.jc1.agregation_country.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private City center;
    private List<District> districts = new ArrayList<>();
    private List<City> cities = new ArrayList<>();

    public Region(City center) {
        this.center = center;
    }

    public double takeArea() {
        double result = 0;
        for(District i: districts) {
            result += i.getArea();
        }
        for (City j: cities) {
            result +=j.getArea();
        }
        return result;
    }

    public City getCenter() {
        return center;
    }

    public void setCenter(City center) {
        this.center = center;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void addDistricts(District district) {
        this.districts.add(district);
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (center != null ? !center.equals(region.center) : region.center != null) return false;
        if (districts != null ? !districts.equals(region.districts) : region.districts != null) return false;
        return cities != null ? cities.equals(region.cities) : region.cities == null;

    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + (districts != null ? districts.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Region{" +
                "center=" + center +
                ", districts=" + districts +
                ", cities=" + cities +
                '}';
    }
}
