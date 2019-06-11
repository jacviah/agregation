package by.jacviah.jc1.agregation_dragon_cave.dao;

import by.jacviah.jc1.agregation_dragon_cave.dao.impl.FileCaveDAO;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private CaveDAO caveDAO = new FileCaveDAO();

    private DAOProvider() {}

    public static DAOProvider getInstance() {

        return instance;
    }

    public CaveDAO getCaveDAO() {
        return caveDAO;
    }
}
