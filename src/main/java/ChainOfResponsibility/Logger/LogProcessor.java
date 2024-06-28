package ChainOfResponsibility.Logger;


public abstract class LogProcessor {
    public int INFO=1;
    public int DEBUG=2;
    public int ERROR=3;

    LogProcessor nextlogProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nextlogProcessor=logProcessor;
    }

    public void log(int logLevel,String message){
        if(nextlogProcessor!=null){
            nextlogProcessor.log(logLevel,message);
        }
    }
}
