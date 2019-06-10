package by.jacviah.jc1.agregation_dragon_cave.dao.impl;

import by.jacviah.jc1.agregation_dragon_cave.dao.CaveDAO;
import by.jacviah.jc1.agregation_dragon_cave.entity.Size;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileCaveDAO implements CaveDAO {
    @Override
    public List<Treasure> getAll() throws Exception {
        FileReader fr = new FileReader("src/resources/treasures.txt");
        Scanner scan = new Scanner(fr);
        List<Treasure> result = new ArrayList<>();
        String[] tokens;

        while (scan.hasNextLine()) {
            String delims = "[|]";
            tokens = scan.nextLine().split(delims);
            result.add(new Treasure(tokens[0],Integer.valueOf(tokens[1]), Size.valueOf(tokens[2])));
        }

        fr.close();
        return result;
    }

   /* @Override
    public Treasure getTreasure() {
        return null;
    }*/
}
