package ru.smirnova.java_2.core.lesson_1;

import java.util.Objects;

public class Dog extends Animal{
    private int passportID;


    public Dog(String name, int age, int passportID) {
        super(name, age); // Ссылка на родителя
        this.passportID = passportID;
    }

    @Override // Переопределяем метод, т к в Animal он был абстрактным
    public void eat(){
        System.out.println("I`m eating");
    }

//    @Override
//    public boolean equals(Object obj){
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()){
//            return  false;
//        }
//        Dog other = (Dog) obj;
//        return passportID == other.passportID &&
//               name == other.name ;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return passportID == dog.passportID &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return passportID + name.length() * 41 - 30;
    }
}
