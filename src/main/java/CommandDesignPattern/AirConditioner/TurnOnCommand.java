package CommandDesignPattern.AirConditioner;

public class TurnOnCommand implements ICommand{
    AirConditioner airConditioner = new AirConditioner();
    TurnOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAC();
    }
}
