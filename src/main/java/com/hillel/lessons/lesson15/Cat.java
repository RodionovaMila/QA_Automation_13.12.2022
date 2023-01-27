package com.hillel.lessons.lesson15;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public static void main(String[] args) {

        Cat murchik = new Cat("Мурчик", 5, 4);

        String murchikName = murchik.getName();

        System.out.println("Изначальное имя кота — " + murchik.getName());
        murchik.setName("Рыжик");
        System.out.println("Новое имя кота — " + murchik.getName());

        int murchikAge = murchik.getAge();
        murchik.setAge(-1000);

        System.out.println("Возраст Рыжика — " + murchik.getAge() + " лет");

        int murchikWeight = murchik.getWeight();
            System.out.println("Вес кота: " + murchikWeight);
        }
    }

