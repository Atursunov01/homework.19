package com.company;

public class Main {


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal[] a = {new Dog(), new Cat(), new Horse()};
        Animal animal1 = new Dog();
        Animal animal2 = new Dog();
        Animal animal3 = new Dog();
        Animal animal4 = new Dog();

        Animal animal5 = new Cat();
        Animal animal6 = new Cat();
        Animal animal7 = new Cat();
        Animal animal8 = new Cat();

        Animal animal9 = new Horse();
        Animal animal10 = new Horse();
        Animal animal11 = new Horse();
        Animal animal12 = new Horse();

        Animal[] animals = {animal1, animal2, animal3, animal4,
                animal5, animal6, animal7, animal8,
                animal9, animal10, animal11, animal12};

        Animal[] animals1 = {animal1,animal2,animal3,animal4};
        Animal[]animals2 = {animal5,animal6,animal7,animal8};
        Animal[]animals3= {animal9,animal10,animal11,animal12};

        for (Animal b : animals) {
            if (b instanceof Dog) {
                ((Dog)b).fastRun();
            }
            else if (b instanceof Cat) {
                ((Cat)b).smart();
            }
            else if (b instanceof Horse){
                ((Horse)b).strong();
            }
        }



        for (Animal animal13 : animals) {
            switch (animal13.getClass().getName()) {
                case "com.company.Dog":
                    ((Dog) animal13).fastRun();
                    break;
                case "com.company.Cat":
                    ((Cat) animal13).smart();
                    break;
                case "com.company.Horse":
                    ((Horse) animal13).strong();
            }

            }

        }

    }



