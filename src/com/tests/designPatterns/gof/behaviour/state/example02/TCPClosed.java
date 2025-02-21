package com.tests.designPatterns.gof.behaviour.state.example02;

public class TCPClosed extends TCPState {
    private static TCPClosed instance = new TCPClosed();

    private TCPClosed() {} // Private constructor for Singleton

    public static TCPClosed getInstance() {
        return instance;
    }

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection...");
        connection.changeState(TCPEstablished.getInstance()); // Transition to Established
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Already closed.");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge, connection is closed.");
    }
}
