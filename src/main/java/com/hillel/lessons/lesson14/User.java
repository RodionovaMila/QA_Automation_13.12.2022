package com.hillel.lessons.lesson14;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private final String name;
    private final LocalDate birthday;
    private final String email;
    private final String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    public User(String name, LocalDate birthday, String email, String phone, String surname, int weight, int pressure, int steps) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = Period.between(birthday, LocalDate.now()).getYears();

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birthday: " + birthday);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps: " + steps);

    }

    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(2000, 2, 26);
        User user1 = new User("Mark", birthday1, "mark@gmail.com", "0932567714", "Ivanchenko", 80, 120, 7000);
        LocalDate birthday2 = LocalDate.of(1983, 10, 15);
        User user2 = new User("Olga", birthday2, "olga@gmail.com", "0953657498", "Sovkova", 60, 90, 8000);
        user1.printAccountInfo();
        user2.printAccountInfo();


        user1.setSurname("Ivanchenko");
        user1.setWeight(65);
        user1.setPressure(110);
        user1.setSteps(5000);
        user2.setSurname("Sovkova");
        user2.setWeight(70);
        user2.setPressure(110);
        user2.setSteps(10000);


        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}