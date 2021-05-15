package ru.smirnova.java_2.core.lesson_1;

public abstract class Animal {
    // abstract - не можем создать его экземпляр

    protected String name; // Видно только из пакета и у наследников
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }




    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge !=0) {
            this.age = newAge;
        }
    }

    public abstract void eat ();

    public void sleep (){
        System.out.println("I am sleeping");
    };
}
