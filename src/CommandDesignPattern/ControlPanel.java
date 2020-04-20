package CommandDesignPattern;

public class ControlPanel {

    private static final int SIZE = 9;

    private Command[] commands;

    public void init() {
        commands = new Command[SIZE];
        for (int i=0; i<SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void keyPress(int index) {
        commands[index].execute();
    }
}
