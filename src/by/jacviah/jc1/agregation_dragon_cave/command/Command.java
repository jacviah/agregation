package by.jacviah.jc1.agregation_dragon_cave.command;

import java.io.IOException;

public interface Command {
    String execute(String[] params) throws IOException;
}
