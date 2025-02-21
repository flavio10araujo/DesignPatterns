package com.tests.designPatterns.gof.behaviour.state.example02;

public class TCPListen extends TCPState {
    private static TCPListen instance = new TCPListen();

    private TCPListen() {}

    public static TCPListen getInstance() {
        return instance;
    }

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Already listening for connections.");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Stopping listening...");
        connection.changeState(TCPClosed.getInstance()); // Transition to Closed
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Listening, cannot acknowledge yet.");
    }
}
