public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = new Logger(LogLevel.WARNING);
        // This will not work.
        logger.log("This is a warning message", LogLevel.DEBUG);
        // This will work.
        logger.log("This is an error message", LogLevel.ERROR);
    }
}
