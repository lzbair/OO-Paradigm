package io.patterns.structural.flyweight;

public interface LogEntry {

    LogEntry NONE = new LogEntry() {
        @Override
        public LogMessage logMessage() {
            return null;
        }

        @Override
        public void write() {
            System.out.println("none");
        }
    };

    LogMessage logMessage();

    void write();
}
