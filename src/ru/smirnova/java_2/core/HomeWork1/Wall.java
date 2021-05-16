package ru.smirnova.java_2.core.HomeWork1;

public class Wall implements TrainingApparatus {

    public String name;
    public int h;

    public Wall(String name, int h) {
        this.name = name;
        this.h = h;
    }

    public boolean overcome(Athlete athlete) {
        System.out.println();
        System.out.println(athlete + " on the wall");
        if (athlete.getH() > h) {
            athlete.jump();
            return true;
        } else {
            System.out.println(athlete + " could not jump");
            return false;
        }
    }
}
