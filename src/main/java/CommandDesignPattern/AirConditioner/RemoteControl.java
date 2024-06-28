package CommandDesignPattern.AirConditioner;

import java.util.Stack;

public class RemoteControl {
    Stack<ICommand> commandhistory = new Stack<>();
    ICommand command;

    RemoteControl(){
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
        commandhistory.add(command);
    }

    public void undo(){
        ICommand lastCommand = commandhistory.pop();
        lastCommand.undo();

    }
}
