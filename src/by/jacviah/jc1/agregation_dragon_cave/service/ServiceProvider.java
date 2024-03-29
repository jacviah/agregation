package by.jacviah.jc1.agregation_dragon_cave.service;

import by.jacviah.jc1.agregation_dragon_cave.service.impl.CaveServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {}

    private CaveService caveService = new CaveServiceImpl();

    public static ServiceProvider getInstance() {
        return instance;
    }


    public CaveService getCaveService() {
        return caveService;
    }

}
