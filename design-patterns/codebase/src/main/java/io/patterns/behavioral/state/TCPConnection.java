package io.patterns.behavioral.state;

public final class TCPConnection {

	public static final String ON = "ON";
	public static final String OFF = "OFF";
	private  TCPState state;

	public TCPConnection() {
		this.state = new TCPListen();
	}

	public String connect() {
		this.state  = state.open();
		return ON;
	}

	public String disconnect() {
		this.state  = state.close();
		return OFF;
	}

}
