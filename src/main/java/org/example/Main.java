/*
 * File: Main.java
 * Author: Resperger Patrik
 * Copyright: 2023, Resperger Patrik
 * Group: Szoft II/1/E
 * Date: 2023-11-30
 * Github: https://github.com/respat/
 * Licenc: GNU GPL
 */

package org.example;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.start();
        controller.stop();
        controller.restart();
    }
}