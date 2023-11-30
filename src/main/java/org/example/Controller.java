/*
 * File: Controller.java
 * Author: Resperger Patrik
 * Copyright: 2023, Resperger Patrik
 * Group: Szoft II/1/E
 * Date: 2023-11-30
 * Github: https://github.com/respat/
 * Licenc: GNU GPL
 */

package org.example;

public class Controller implements Controllable {
    @Override
    public void start() {
        System.out.println("Folyamat elindítva.");
    }

    @Override
    public void stop() {
        System.out.println("Folyamat leállítva.");
    }

    @Override
    public void restart() {
        System.out.println("Folyamat újraindítva.");
    }
}
