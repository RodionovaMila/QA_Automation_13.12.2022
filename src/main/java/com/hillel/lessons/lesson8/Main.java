package com.hillel.lessons.lesson8;

public class Main {
    private static boolean LuckyNumbers(int num) {

        int i = num % 10;
        do {
            if(i == 4 || i == 9)
                return false;
            num /= 10;
            i = num % 10;
        }while (num > 0);
        return true;


    }

    public static void main(String[] args) {
        int counter = 0;
        int num = 1;
        int num1 = 1;
        while (num <= 100) {
            if (LuckyNumbers(num1)) {
                System.out.println(num1);
                counter++;

                num++;

            }
            num1++;

        }

        System.out.println("counter = " + counter);

    }

}

