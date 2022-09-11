package io.patterns.structural.flyweight;


public class LogMessage {

    private final byte[] message;

    public LogMessage(byte[] message) {
        this.message = message;
    }


    LogEntry newLogEntry(LogEntryContext context) {
        return new LightLogEntry(context, this); // reuse this object as shared LogMessage between different contexts
    }

    void print(){
        System.out.println(message);
    }
}
