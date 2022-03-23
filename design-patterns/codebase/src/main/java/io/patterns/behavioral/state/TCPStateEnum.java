package io.patterns.behavioral.state;

public enum TCPStateEnum {

    LISTEN {
        @Override
        TCPState open() {
            return new TCPEstablished();
        }

        @Override
        TCPState close() {
            throw new IllegalStateException();
        }
    },
    ESTABLISHED {
        @Override
        TCPState open() {
            throw new IllegalStateException();

        }

        @Override
        TCPState close() {
            return new TCPListen();
        }
    };


    abstract TCPState open();

    abstract TCPState close();
}
