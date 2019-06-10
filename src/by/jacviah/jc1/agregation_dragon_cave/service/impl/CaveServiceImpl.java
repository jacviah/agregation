package by.jacviah.jc1.agregation_dragon_cave.service.impl;

import by.jacviah.jc1.agregation_dragon_cave.dao.CaveDAO;
import by.jacviah.jc1.agregation_dragon_cave.dao.DAOProvider;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;
import by.jacviah.jc1.agregation_dragon_cave.service.CaveService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacviah on 10.06.2019.
 */
public class CaveServiceImpl implements CaveService {
    @Override
    public Treasure getMostExpensive() throws Exception {
        DAOProvider provider = DAOProvider.getInstance();
        CaveDAO caveDAO = provider.getCaveDAO();
        List<Treasure> all = caveDAO.getAll();
        Treasure result = null;
        int maxPrice = -1;
        for (Treasure i : all) {
            if (i.getPrice() > maxPrice) {
                maxPrice = i.getPrice();
                result = i;
            }
        }
        return result;
    }

    @Override
    public List<Treasure> getTreasuresForAGivenAmount(int amount) throws Exception {
        DAOProvider provider = DAOProvider.getInstance();
        CaveDAO caveDAO = provider.getCaveDAO();
        List<Treasure> all = caveDAO.getAll();
        List<Treasure> result = new ArrayList<>();
        Treasure cheapest = null;
        int minPrice = Integer.MAX_VALUE;
        int index = -1;
        int sum = 0;
        while (sum < amount) {
            minPrice = Integer.MAX_VALUE;
            index = -1;
            for (Treasure i : all) {
                if (i.getPrice() < minPrice) {
                    minPrice = i.getPrice();
                    cheapest = i;
                    index = all.indexOf(i);
                }
            }
            if (sum + minPrice < amount) {
                sum += minPrice;
                result.add(cheapest);
                all.remove(index);
            } else {
                break;
            }
        }
        return result;
    }

    @Override
    public List<Treasure> getAll() throws Exception {
        DAOProvider provider = DAOProvider.getInstance();
        CaveDAO caveDAO = provider.getCaveDAO();
        return caveDAO.getAll();
    }
}
