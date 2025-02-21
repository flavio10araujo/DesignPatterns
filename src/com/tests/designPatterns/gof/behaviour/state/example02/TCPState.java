package com.tests.designPatterns.gof.behaviour.state.example02;

public abstract class TCPState {
    public abstract void open(TCPConnection connection);
    public abstract void close(TCPConnection connection);
    public abstract void acknowledge(TCPConnection connection);
}
