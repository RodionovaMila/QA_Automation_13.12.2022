package com.hillel.lessons.lesson15;

    public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя кота не может быть пустым!");
        }
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Имя кота может содержать только буквы!");
        }
        this.name = name.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 20) {
            throw new IllegalArgumentException("Возраст кота должен быть в диапазоне от 0 до 20 лет!");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0 || weight > 30) {
            throw new IllegalArgumentException("Вес кота должен быть в диапазоне от 0 до 30 кг!");
        }
        this.weight = weight;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        try {
            cat.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // выводит "Имя кота не может быть пустым!"
        }
        try {
            cat.setName("Мурзик123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // выводит "Имя кота может содержать только буквы!"
        }
        try {
            cat.setAge(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // выводит "Возраст кота должен быть в диапазоне от 0 до 20 лет!"
        }
        try {
            cat.setWeight(50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // выводит "Вес кота должен быть в диапазоне от 0 до 30 кг!"
        }
    }
}