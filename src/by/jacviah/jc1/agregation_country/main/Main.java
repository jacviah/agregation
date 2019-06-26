package by.jacviah.jc1.agregation_country.main;

import by.jacviah.jc1.agregation_country.entity.City;
import by.jacviah.jc1.agregation_country.entity.District;
import by.jacviah.jc1.agregation_country.entity.Region;
import by.jacviah.jc1.agregation_country.entity.State;
import by.jacviah.jc1.agregation_country.logic.StateLogic;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        District district1 = new District(new City("Pinsk", false, false, true , 51.48), 3256);
        District district2 = new District(new City("Kobryn", false, false, true , 26), 2039);
        District district3 = new District(new City("Luninets", false, false, true , 55), 2709);
        District district4 = new District(new City("Ivatsevichy", false, false, true , 32), 2998);
        District district5 = new District(new City("Pruzhany", false, false, true ,24), 2826);
        District district6 = new District(new City("Drahichyn", false, false, true , 19.2), 1855);

        Region region1 = new Region(new City("Brest", false, true, true , 146.12));
        region1.addDistricts(district1);
        region1.addDistricts(district2);
        region1.addDistricts(district3);
        region1.addDistricts(district4);
        region1.addDistricts(district5);
        region1.addDistricts(district6);

        Region region2 = new Region(new City("Vitebsk", false, true, true , 124.19));
        Region region3 = new Region(new City("Gomel", false, true, true , 139.77));

        State state1 = new State("Belarus", new City("Minsk", true, true, false, 450));
        state1.addRegion(region1);
        state1.addRegion(region2);
        state1.addRegion(region3);

        StateLogic logic = new StateLogic();

        printCapital(state1);
        printRegionsAmount(logic.takeRegionsAmount(state1));
        printStateArea(logic.takeArea(state1));
        printRegionCenters(logic.takeRegionCenters(state1));

    }

    public static void printCapital(State state){
        System.out.println(state.getCapital());
    }

    public static void printRegionsAmount(int x){
        System.out.println("Number of regions is " + x);
    }

    public static void printStateArea(int x){
        System.out.println("State area is " + x);
    }
    public static void printRegionCenters(List<City> list){
        for(City i: list) {
            System.out.println("Region center is " + i.getName());
        }
    }

}
