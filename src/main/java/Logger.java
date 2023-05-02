import java.util.ArrayList;
import java.util.List;

enum LogLevel {
    DEBUG, INFO, WARNING, ERROR
}

interface LogTarget {
    void log(String message, LogLevel level);
}

class ConsoleLogTarget implements LogTarget {
    @Override
    public void log(String message, LogLevel level) {
        System.out.println("[" + level + "] " + message);
    }
}

class EmailLogTarget implements LogTarget {
    @Override
    public void log(String message, LogLevel level) {
        System.out.println(message);
    }
}

class FileLogTarget implements LogTarget {
    @Override
    public void log(String message, LogLevel level) {
        System.out.println(message);
    }
}

class ServerApiLogTarget implements LogTarget {
    @Override
    public void log(String message, LogLevel level) {
        System.out.println(message);
    }
}

class Logger {
    private LogLevel minLogLevel;
    private List<LogTarget> logTargets;

    public Logger(LogLevel minLogLevel) {
        this.minLogLevel = minLogLevel;
        this.logTargets = new ArrayList<>();
        this.logTargets.add(new ConsoleLogTarget()); // default log target
    }

    public void setMinLogLevel(LogLevel minLogLevel) {
        this.minLogLevel = minLogLevel;
    }

    public void addTarget(LogTarget logTarget) {
        this.logTargets.add(logTarget);
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() >= minLogLevel.ordinal()) {
            for (LogTarget logTarget : logTargets) {
                logTarget.log(message, level);
            }
        }
    }
}