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
