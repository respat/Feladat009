package org.example;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.start();
        controller.stop();
        controller.restart();
    }
}