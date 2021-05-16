package ru.smirnova.java_2.core.HomeWork1;

public class Treadmill implements TrainingApparatus {

    public String name;
    public int l;

    public Treadmill(String name, int l) {
        this.name = name;
        this.l = l;
    }

    // (Тип и название параметров)
    public boolean overcome(Athlete athlete) {
        System.out.println();
        System.out.println(athlete + " on the treadmill");
        if (athlete.getL() >= l) {
            athlete.run();
            return true;
        } else {
            System.out.println(athlete + " could not run");
            return false;
        }
    }
}
