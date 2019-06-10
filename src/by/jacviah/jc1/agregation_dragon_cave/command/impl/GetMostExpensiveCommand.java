package by.jacviah.jc1.agregation_dragon_cave.command.impl;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;
import by.jacviah.jc1.agregation_dragon_cave.service.ServiceProvider;

import java.util.List;

/**
 * Created by jacviah on 11.06.2019.
 */
public class GetMostExpensiveCommand implements Command {
    @Override
    public String execute(String[] params) throws Exception {
        ServiceProvider provider = ServiceProvider.getInstance();
        Treasure t = provider.getCaveService().getMostExpensive();
        String result += "name: " + t.getName() + ", price: " + t.getPrice() + ", size: " + t.getSize() + ";\n";
        return result;
    }
}
