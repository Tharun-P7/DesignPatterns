package ChainOfResponsibility.Logger;


public class DebugProcessor extends LogProcessor {
    DebugProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG :" + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
