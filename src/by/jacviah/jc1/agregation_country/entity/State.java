package by.jacviah.jc1.agregation_country.entity;


import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private City capital;
    private List<Region> regions = new ArrayList<>();

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region){
        this.regions.add(region);
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (name != null ? !name.equals(state.name) : state.name != null) return false;
        return capital != null ? capital.equals(state.capital) : state.capital == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }
}
