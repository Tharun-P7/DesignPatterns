package CommandDesignPattern.AirConditioner;

public class TurnOffCommand implements ICommand{
    AirConditioner airConditioner=new AirConditioner();
    TurnOffCommand(AirConditioner airConditioner){
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
