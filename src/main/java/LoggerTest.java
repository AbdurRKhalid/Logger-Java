public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = new Logger(LogLevel.WARNING);
        logger.log("This is a warning message", LogLevel.WARNING);
        logger.log("This is an error message", LogLevel.ERROR);
    }
}
