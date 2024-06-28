package ChainOfResponsibility.Logger;

public class InfoProcessor extends LogProcessor{
    InfoProcessor(LogProcessor nextLogProcessor){super(nextLogProcessor);}

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO log :"+ message);
        } else {
            super.log(logLevel, message);
        }
    }
}
