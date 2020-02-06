package io.patterns.behavioral.state;

public class TCPRequest {

    private final String body;

    public TCPRequest(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return body;
    }

}
