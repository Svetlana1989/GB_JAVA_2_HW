package ru.smirnova.java_2.core.lesson_1;

public class Cat {

    // Что знает? Переменные
    public String name; // Видно всем
    protected int age; // Видно только из пакета и у наследников
    double weight; // Видно только из пакета (paket private)
    private int passportID; // Видно только из класса, не видно даже у наследника


    // Что умеет? Методы
    public void eat(Food catFood){
    //        System.out.println(name + " is eating " + catFood.foodTitle);
    // \n - конец строки

        System.out.printf("%s with passportID %d is eating %s\n", name, passportID, catFood.foodTitle);
    };

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", passportID=" + passportID +
                '}';
    }
}
