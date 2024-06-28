package ChainOfResponsibility.Logger;

public class Main {

    public static void main(String[] args) {
    LogProcessor logProcessor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

    logProcessor.log(logProcessor.ERROR, "Exceptions happen");
    logProcessor.log(logProcessor.INFO, "INFO log");
    logProcessor.log(logProcessor.DEBUG, "Debug log");

    }

}
