package by.jacviah.jc1.agregation_dragon_cave.controller;

import by.jacviah.jc1.agregation_dragon_cave.command.Command;
import by.jacviah.jc1.agregation_dragon_cave.command.CommandProvider;

/**
 * Created by jacviah on 11.06.2019.
 */
public class Controller {
    private CommandProvider provider = new CommandProvider();


    public String doAction(String request) throws Exception{
        String[] params = request.split("[|]");
        String response = null;
        Command command = provider.getCommand(params[0]);
        response = command.execute(params);
        return response;
    }
}
