package io.patterns.state;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class TCPConnectionTest {

    @Test
    public void testConnectionSuccess() {
        final TCPConnection tcp = new TCPConnection();
        tcp.connect();
        tcp.disconnect();
        Assertions.assertEquals(TCPConnection.ON, tcp.connect());
        Assertions.assertEquals(TCPConnection.OFF, tcp.disconnect());
    }

    @Test
    public void testConnectionFailure() {
        assertThrows(IllegalStateException.class, () -> {
            final TCPConnection tcp = new TCPConnection();
            tcp.connect();
            tcp.connect();
        });
    }

    @Test
    public void testDisconnectionFailure() {
        assertThrows(IllegalStateException.class, () -> {
            final TCPConnection tcp = new TCPConnection();
            tcp.connect();
            tcp.disconnect();
            tcp.disconnect();
        });
    }
}
