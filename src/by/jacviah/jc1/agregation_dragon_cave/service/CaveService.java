package by.jacviah.jc1.agregation_dragon_cave.service;

import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;

import java.util.List;

/**
 * Created by jacviah on 10.06.2019.
 */
public interface CaveService {
    public Treasure getMostExpensive() throws Exception;
    public List<Treasure> getTreasuresForAGivenAmount(int amount) throws Exception;
    public List<Treasure> getAll() throws Exception;
}
