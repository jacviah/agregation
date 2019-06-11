package by.jacviah.jc1.agregation_dragon_cave.dao;

import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;

import java.io.IOException;
import java.util.List;

public interface CaveDAO {
    public List<Treasure> getAll() throws IOException;
}
