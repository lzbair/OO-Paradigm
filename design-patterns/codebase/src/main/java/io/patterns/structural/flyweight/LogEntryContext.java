package io.patterns.structural.flyweight;

import java.time.LocalDateTime;

public class LogEntryContext {
    private final LocalDateTime timestamp;
    private final String threadName;

    public LogEntryContext(LocalDateTime timestamp, String threadName) {
        this.timestamp = timestamp;
        this.threadName = threadName;
    }

    public LocalDateTime timestamp() {
        return timestamp;
    }

    public String threadName() {
        return threadName;
    }
}
