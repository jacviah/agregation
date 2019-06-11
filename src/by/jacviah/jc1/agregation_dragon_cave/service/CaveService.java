package by.jacviah.jc1.agregation_dragon_cave.service;

import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CaveService {
    public Treasure getMostExpensive() throws IOException;
    public List<Treasure> getTreasuresForAGivenAmount(int amount) throws IOException;
    public List<Treasure> getAll() throws IOException;
}
