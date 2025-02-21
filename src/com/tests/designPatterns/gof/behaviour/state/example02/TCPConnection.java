package com.tests.designPatterns.gof.behaviour.state.example02;

public class TCPConnection {
    private TCPState state; // Current state

    public TCPConnection() {
        state = TCPClosed.getInstance(); // Start with a closed state
    }

    public void changeState(TCPState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void acknowledge() {
        state.acknowledge(this);
    }
}
