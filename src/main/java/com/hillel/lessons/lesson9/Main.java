package com.hillel.lessons.lesson9;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        new Main().execute();
    }

    private void execute() {
        Team sapphir = new Team("Сапфир");
        Team kamelot = new Team("Камелот");
        double sapphirAverageAge = sapphir.averageAge();
        double kamelotAverageAge = kamelot.averageAge();
        System.out.println(sapphir);
        System.out.println(sapphirAverageAge);
        System.out.println(kamelot);
        System.out.println(kamelotAverageAge);
        if (sapphirAverageAge > kamelotAverageAge)
            System.out.println("Средний возраст игроков команды "+ sapphir.getName() + " больше");
        else if (sapphirAverageAge < kamelotAverageAge)
            System.out.println("Средний возраст игроков команды " + kamelot.getName() + " больше");
        else System.out.println("Средний возраст команд равный");

    }

    class Team {
        private Person[] people;
        private String name;

        public Team(String name) {
            this.people = new Person[25];
            this.name = name;
            ThreadLocalRandom random = ThreadLocalRandom.current();
            for (int i = 0; i < 25; i++) {
                Person person = new Person(random.nextInt(18, 40));
                people[i] = person;
            }

        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (Person person : people) {
                builder.append(person.getAge());
                builder.append(" ");
            }
            return "Возраст игроков команды " + name + ": " + builder.toString();
        }

        public double averageAge() {
            double res = 0;
            for (Person person : people) res += person.getAge();
            return res / 25.0;
        }
    }

    class Person {
        private int age;

        public int getAge() {
            return age;
        }

        public Person(int age) {
            this.age = age;
        }
    }
}


