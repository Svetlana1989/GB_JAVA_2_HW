package ru.smirnova.java_2.core.HomeWork1;

// Точка входа в программу. Код нельзя написать все класса.
public class Main extends Object {

    public static void main(String[] args) {
        Cat cat = new Cat("Murzic", 40, 4);
        Human human = new Human("Vadic", 60, 25);
        Robot robot = new Robot("Vally", 20, 10);

        Treadmill treadmill = new Treadmill("Treadmill_50", 50);
        Wall wall = new Wall("Wall_20", 20);

        Athlete[] athletes = {cat, human, robot};
        TrainingApparatus[] trainingApparatuses = {treadmill, wall};

        for (int i = 0; i < athletes.length; i++) {
            for (int j = 0; j < trainingApparatuses.length; j++) {
                boolean result = trainingApparatuses[j].overcome(athletes[i]);
                if (result == false) {
                    break;
                }
            }
        }
    }
}






























   

