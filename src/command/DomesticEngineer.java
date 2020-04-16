package command;

public class DomesticEngineer implements Command {
    @Override
    public void execute() {
        System.out.println("Take out trash.");
    }
}
