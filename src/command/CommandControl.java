package command;

import java.util.ArrayList;
import java.util.List;

public class CommandControl {
    public static List<Command> queue = new ArrayList<>();

    public static void collect(){
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
    }

    public static void processQueue(){
        for(Command command: queue){
            command.execute();
        }
    }

}
