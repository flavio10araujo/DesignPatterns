package com.tests.designPatterns.gof.behaviour.state.example02;

public class TCPEstablished extends TCPState {
    private static TCPEstablished instance = new TCPEstablished();

    private TCPEstablished() {}

    public static TCPEstablished getInstance() {
        return instance;
    }

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection already established.");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection...");
        connection.changeState(TCPClosed.getInstance()); // Transition to Closed
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Acknowledging packet...");
    }
}
