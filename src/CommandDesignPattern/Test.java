package CommandDesignPattern;

/**
 * 命令模式：把命令封装成对象，使发送者和执行者解耦。
 * 此例中，遥控器和电器之间完全解耦，通过command来进行交互
 * */
public class Test {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.init();
        controlPanel.setCommand(1, new DoorOnCommand(new Door()));
        controlPanel.keyPress(1);
    }
}
