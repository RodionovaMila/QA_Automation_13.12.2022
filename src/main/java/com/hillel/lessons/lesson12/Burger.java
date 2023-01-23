package com.hillel.lessons.lesson12;


    public class Burger {

        String bun;
        String cheese;
        String lettuce;
        String meat;
        String mayonnaise;


    public Burger(String bun,  String cheese, String lettuce, String meat, String mayonnaise) {

        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад звичайного бургера:" + bun + "," + cheese + "," + lettuce + "," +  meat + "," + mayonnaise);

    }

    public Burger(String bun, String cheese, String lettuce, String meat) {

        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.meat = meat;
        System.out.println("Склад дієтичного бургера:" + bun + ","  + cheese + "," + lettuce + "," + meat );
    }

    public Burger(String bun, String cheese, String lettuce) {

        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;

        System.out.println("Склад вегетаріанського бургера:" + bun + "," + cheese + "," + lettuce);

    }

}




