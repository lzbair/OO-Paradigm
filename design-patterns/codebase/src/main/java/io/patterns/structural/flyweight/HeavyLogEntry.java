package io.patterns.structural.flyweight;

import java.time.LocalDateTime;

public class HeavyLogEntry implements LogEntry {

    private final LocalDateTime timestamp;
    private final String threadName;
    private final LogMessage message;

    public HeavyLogEntry(LocalDateTime timestamp, String threadName, LogMessage message) {
        this.timestamp = timestamp;
        this.threadName = threadName;
        this.message = message;
    }

    @Override
    public LogMessage logMessage() {
        return message;
    }

    @Override
    public void write() {
        System.out.println(String.format("when=%s | which=%s | what=%s",
                timestamp, threadName, message));
    }
}
