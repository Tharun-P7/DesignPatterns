package ChainOfResponsibility.Logger;

public class ErrorProcessor extends LogProcessor{
    ErrorProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR) {
            System.out.println("ERROR in code :"+ message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
