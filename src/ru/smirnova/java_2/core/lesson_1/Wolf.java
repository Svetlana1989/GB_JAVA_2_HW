package ru.smirnova.java_2.core.lesson_1;

public class Wolf extends Animal implements EatMeat{
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("I`m eating, auf");
    }

    public void wolfSpecificMethod(){
        System.out.println("Auf!!!");
    }
}
