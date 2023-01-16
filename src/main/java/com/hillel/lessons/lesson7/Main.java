package com.hillel.lessons.lesson7;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String guessNumber = "Угадай число: ";
    private static final String Congratulation = "Поздравляем!!! Вы выиграли!";
    private static final int attemptsNumber = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        final int randomNumber = random.nextInt(10);
        int usersNumber;
        for (int i = 0; i < attemptsNumber; i++) {
            System.out.println(guessNumber);
            usersNumber = in.nextInt();
            if (randomNumber == usersNumber) {
                System.out.println(Congratulation);
                break;

            } else
                System.out.println(usersNumber > randomNumber ? "Моё число меньше" : "Моё число больше");
        }
        System.out.printf("Загаданное число %d%n", randomNumber);
    }
}


