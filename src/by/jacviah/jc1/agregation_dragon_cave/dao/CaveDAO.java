package by.jacviah.jc1.agregation_dragon_cave.dao;

import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;

import java.util.List;

/**
 * Created by jacviah on 10.06.2019.
 */
public interface CaveDAO {
    public List<Treasure> getAll() throws Exception;
   // public Treasure getTreasure();
}
