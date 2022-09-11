package io.patterns.structural.flyweight;


public class LightLogEntry implements LogEntry {
    private final LogEntryContext context;
    private final LogMessage message;

    public LightLogEntry(LogEntryContext context, LogMessage message) {
        this.context = context;
        this.message = message;
    }

    @Override
    public LogMessage logMessage() {
        return message;
    }

    @Override
    public void write() {
        System.out.println(String.format("when=%s | which=%s | what=%s",
                context.timestamp(), context.threadName(), message));
    }
}
