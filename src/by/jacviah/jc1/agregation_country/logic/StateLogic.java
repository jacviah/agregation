package by.jacviah.jc1.agregation_country.logic;

import by.jacviah.jc1.agregation_country.entity.City;
import by.jacviah.jc1.agregation_country.entity.Region;
import by.jacviah.jc1.agregation_country.entity.State;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

    public StateLogic() {
    }

    public int takeRegionsAmount(State state) {
        int result = state.getRegions().size();
        return result;
    }

    public int takeArea(State state) {
        List<Region> regions = state.getRegions();
        int result = 0;
        for(Region i: regions) {
            result+=i.takeArea();
        }
        return result;
    }

    public List<City> takeRegionCenters(State state) {
        List<Region> regions = state.getRegions();
        List<City> centers = new ArrayList<>();
        for(Region i: regions) {
            centers.add(i.getCenter());
        }
        return centers;
    }

}
