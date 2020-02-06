package io.patterns.behavioral.state;

public class TCPListen implements TCPState {

	@Override
	public TCPState close() {
		throw  new IllegalStateException("The connection is not opened yet");

	}

	@Override
	public TCPState open() {
		return new TCPEstablished();
	}

}
