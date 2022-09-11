package io.patterns.structural.flyweight;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LogEntryFactory {

    private static final Map<Integer, LogMessage> messages = new HashMap<>(); // flyweights

    static LogEntry light(LocalDateTime timestamp, String threadName, byte[] log) {
        LogMessage logMessage = messages.computeIfAbsent(
                Arrays.hashCode(log),
                key -> new LogMessage(log));

        return logMessage.newLogEntry(new LogEntryContext(timestamp, threadName));
    }

    static LogEntry heavy(LocalDateTime timestamp, String threadName, byte[] log) {
        return new HeavyLogEntry(timestamp, threadName, new LogMessage(log));
    }
}
