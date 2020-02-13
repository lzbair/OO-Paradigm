package io.patterns.behavioral.state;

import java.util.ArrayList;
import java.util.List;

class TCPConnectionPool {

    final List<TCPConnection> connections = new ArrayList<>();


    TCPConnection connect() {
        if (connections.isEmpty()) {
            TCPConnection conn = new TCPConnection();
            conn.connect();
            connections.add(conn);
            return conn;
        }
        return available();
    }

    private TCPConnection available() {
       return  this.connections.stream().filter(TCPConnection::available).findFirst().get();
    }

}
