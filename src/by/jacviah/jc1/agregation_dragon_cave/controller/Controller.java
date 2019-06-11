package by.jacviah.jc1.agregation_dragon_cave.controller;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.command.CommandProvider;

import java.io.IOException;

public class Controller {
    private CommandProvider provider = new CommandProvider();


    public String doAction(String request) {
        String[] params = request.split("[|]");
        String response = null;
        Command command = provider.getCommand(params[0]);
        try {
            response = command.execute(params);
        } catch (IOException e) {
            System.out.println("Resource file not found");
        }
        return response;
    }
}
