package CommandDesignPattern;

public class LightOnCommand implements Command {

    private  Light light;

    public void LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
