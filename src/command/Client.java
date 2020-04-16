package command;

public class Client {

    public static void main(String[] args) {
        CommandControl.collect();
        CommandControl.processQueue();
    }

}
