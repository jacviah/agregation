package by.jacviah.jc1.agregation_dragon_cave.command.impl;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;
import by.jacviah.jc1.agregation_dragon_cave.service.ServiceProvider;

import java.io.IOException;
import java.util.List;

public class GetMostExpensiveCommand implements Command {
    @Override
    public String execute(String[] params) throws IOException {
        ServiceProvider provider = ServiceProvider.getInstance();
        Treasure t = provider.getCaveService().getMostExpensive();
        String result = "name: " + t.getName() + ", price: " + t.getPrice() + ", size: " + t.getSize() + ";\n";
        return result;
    }
}
