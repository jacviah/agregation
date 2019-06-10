package by.jacviah.jc1.agregation_dragon_cave.command.impl;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;
import by.jacviah.jc1.agregation_dragon_cave.service.ServiceProvider;

import java.util.List;

/**
 * Created by jacviah on 11.06.2019.
 */
public class FindTreasuresForAAmountCommand implements Command {
    @Override
    public String execute(String[] params) throws Exception {
        ServiceProvider provider = ServiceProvider.getInstance();
        List<Treasure> list = provider.getCaveService().getTreasuresForAGivenAmount(Integer.valueOf(params[1]));
        String result = "";
        for (Treasure i: list) {
            result+="name: " + i.getName() + ", price: " + i.getPrice() + ", size: " + i.getSize() + ";\n";
        }
        return result;
    }
}
