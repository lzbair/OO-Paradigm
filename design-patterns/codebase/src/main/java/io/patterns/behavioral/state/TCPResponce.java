package io.patterns.behavioral.state;

public class TCPResponce {

    private final String status;

    public TCPResponce(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }

}
