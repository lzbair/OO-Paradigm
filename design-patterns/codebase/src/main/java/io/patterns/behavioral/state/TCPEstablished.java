package io.patterns.behavioral.state;

class TCPEstablished implements TCPState {

	

	@Override
	public TCPState close() {
		return new TCPListen();

	}

	@Override
	public TCPState open() {
		throw  new IllegalStateException("The connection is already opened");
	}

}
