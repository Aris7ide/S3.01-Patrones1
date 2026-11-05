package N1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo undo;
    private List<String> commands;

    private Undo() {
        commands = new ArrayList<>();
        System.out.println("Undo has been created");
    }

    public static Undo getInstance() {
        if (undo == null) {
            undo = new Undo();
        }
        return undo;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void undoCommand() {
        commands.removeLast();
    }

    public List<String> showHistory() {
        return commands;
    }
}
