package io.patterns.behavioral.state;

public final class TCPConnection {

    public static final String ON = "ON";
    public static final String OFF = "OFF";
    private TCPState state;

    TCPConnection() {
        this.state = new TCPListen();
    }

    String connect() {
        this.state = state.open();
        return ON;
    }

    String disconnect() {
        this.state = state.close();
        return OFF;
    }

    boolean available() {
        return this.state instanceof TCPListen;
    }

}
