package ru.smirnova.java_2.core.lesson_1;

public class Eagle extends Animal implements Flyable, EatMeat{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void canFly() {

    }
}
