public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = new Logger(LogLevel.WARNING);
        // This will not work.
        logger.log("This is a warning message", LogLevel.DEBUG);
        // This will work.
        logger.log("This is an error message", LogLevel.ERROR);

        // Adding the Email Target to Send While Logging Info to Console.
        logger.addTarget(new EmailLogTarget());
        logger.log("An Informational Message to Send Via Email!", LogLevel.WARNING);
    }
}
