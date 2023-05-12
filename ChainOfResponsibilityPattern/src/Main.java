public class Main {


        private static AbstractLogger getChainOfLoggers() {
            AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
            AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
            AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

            errorLogger.setNextLogger(fileLogger);
            fileLogger.setNextLogger(consoleLogger);

            return errorLogger;
        }

    public static void main(String[] args) {


            AbstractLogger loggerChain = getChainOfLoggers();

            loggerChain.logMessage(AbstractLogger.INFO,"Bu bir info mesaji");
            loggerChain.logMessage(AbstractLogger.DEBUG,"Bu bir debug mesaji");
            loggerChain.logMessage(AbstractLogger.ERROR,"Bu bir error mesaji");
    }




}