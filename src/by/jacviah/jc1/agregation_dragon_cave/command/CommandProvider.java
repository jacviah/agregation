package by.jacviah.jc1.agregation_dragon_cave.command;

import by.jacviah.jc1.agregation_dragon_cave.command.impl.FindTreasuresForAAmountCommand;
import by.jacviah.jc1.agregation_dragon_cave.command.impl.GetMostExpensiveCommand;
import by.jacviah.jc1.agregation_dragon_cave.command.impl.ViewAllCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacviah on 11.06.2019.
 */
public class CommandProvider {
    private Map<String, Command> commands = new HashMap<String, Command>();

    public CommandProvider() {
        commands.put("view all", new ViewAllCommand());
        commands.put("find treasures for a given amount", new FindTreasuresForAAmountCommand());
        commands.put("get most expensive treasure", new GetMostExpensiveCommand());
    }


    public Command getCommand(String commandName) {
        Command command;
        command = commands.get(commandName);

        return command;
    }
}
