package ru.smirnova.java_2.core.lesson_1;

public class Rat extends Animal{

    protected double weight;

    public Rat(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }



    @Override
    public void eat() {
        System.out.println(this.name + " " + this.weight + " " + this.age);
        System.out.println("I`m eating pi-pi-pi");
    }
}
