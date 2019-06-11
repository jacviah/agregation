package by.jacviah.jc1.agregation_dragon_cave.command.impl;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.entity.Treasure;
import by.jacviah.jc1.agregation_dragon_cave.service.ServiceProvider;

import java.io.IOException;
import java.util.List;

public class ViewAllCommand implements Command {
    @Override
    public String execute(String[] params) throws IOException {
        ServiceProvider provider = ServiceProvider.getInstance();
        List<Treasure> list = provider.getCaveService().getAll();
        String result = "";
        for (Treasure i: list) {
            result+="name: " + i.getName() + ", price: " + i.getPrice() + ", size: " + i.getSize() + ";\n";
        }
        return result;
    }
}
