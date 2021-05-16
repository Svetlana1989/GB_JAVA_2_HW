package ru.smirnova.java_2.core.HomeWork1;

public class Cat implements Athlete {

    public String name;
    public int l;
    public int h;

    public Cat(String name, int l, int h) {
        this.name = name;
        this.l = l;
        this.h = h;
    }

    public void run() {
        System.out.println("Cat_" + name + ": I ran!");
    }

    public void jump() {
        System.out.println("Cat_" + name + ": I jumped!");
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
