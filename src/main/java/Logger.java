import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Logger {
    // Setting the Minimum Log Level as DEBUG, by Default.
    private LogLevel minimumLogLevel = LogLevel.DEBUG;

    // To Hold the Targets.
    private Map<LogLevel, Consumer<String>> logTargets = new HashMap<>();

    // Setting the Minimum Log Level.
    public void setMinimumLogLevel(LogLevel minimumLogLevel) {
        this.minimumLogLevel = minimumLogLevel;
    }

    // Putting the Log Target.
    public void setLogTarget(LogLevel logLevel, Consumer<String> logTarget) {
        logTargets.put(logLevel, logTarget);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.compareTo(minimumLogLevel) >= 0) {
            logTargets.forEach((targetLogLevel, logTarget) -> {
                if(logLevel.compareTo(targetLogLevel) >= 0) {
                    logTarget.accept(message);
                }
            });
        }
    }
}
