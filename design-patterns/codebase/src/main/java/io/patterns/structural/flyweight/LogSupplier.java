package io.patterns.structural.flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class LogSupplier  {

    static final Supplier<LogEntry> LIGHT = () -> {
        try {
            return LogEntryFactory.light(
                    LocalDateTime.now(), Thread.currentThread().getName(), log());
        } catch (IOException e) {
            return LogEntry.NONE;
        }
    };

    static final Supplier<LogEntry> HEAVY = () -> {
        try {
            return LogEntryFactory.heavy(
                    LocalDateTime.now(), Thread.currentThread().getName(), log());
        } catch (IOException e) {
            return LogEntry.NONE;
        }
    };


    static byte[] log() throws IOException {
        return Files.readAllBytes(Paths.get("src/main/resources/log.txt"));
    }

}
