package com.tests.designPatterns.gof.behaviour.state.example02;

public class Main {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.open(); // Opening connection...
        connection.acknowledge(); // Acknowledging packet...
        connection.close(); // Closing connection...
        connection.acknowledge(); // Cannot acknowledge, connection is closed.
    }
}
