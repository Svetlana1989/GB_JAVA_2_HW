package ru.smirnova.java_2.core.lesson_1;

import ru.smirnova.java_2.core.lesson_1.Cat;
import ru.smirnova.java_2.core.lesson_1.Food;

// Точка входа в программу. Код нельзя написать все класса.
public class Main extends Object {

    public static void main(String[] args) {
     Cat myCat = new Cat();
//     Cat myCat2 = new Cat();
     myCat.name = "MurziK";
//     myCat2.name = "Kuzya";
//
//     Food catFood = new Food();
//     catFood.foodTitle = "Kittycat";
//
//     myCat.eat(catFood);
//     myCat2.eat(catFood);
//
//     Wolf myWolf = new Wolf("Arrrrr", 5);
//     Rat myRat = new Rat("Pica", 1, 1.5);
//     Dog myDog = new Dog("Sharic", 1);

//     Animal[] myAnimals = {myDog, myRat, myWolf};
//     giveFoodToAnimal(myAnimals);

//        System.out.println(myCat);

        EatMeat a = new Wolf("Wu", 5);
        EatMeat b = new Eagle("Orel", 6);
        EatMeat[] myasoedy = {a, b};

        Dog sharic = new Dog("Sharic", 6, 12345);
        Dog myDog = new Dog("Sharic", 6, 12345);
        Dog thirdDog = myDog;
//        System.out.println(sharic == myDog); // Не равны, память разная
//        System.out.println(thirdDog == myDog); // Смотрят на один и тот же объект, память одна
//        System.out.println(sharic.equals(myCat));

        System.out.println(sharic.hashCode());
        System.out.println(myDog.hashCode());


    }
    // Полиморфизм
    public static void giveFoodToAnimal(Animal[] animals){
     for (Animal animal: animals){
      animal.eat();
//      ((Wolf) animal).wolfSpecificMethod();
     }
    }
}
