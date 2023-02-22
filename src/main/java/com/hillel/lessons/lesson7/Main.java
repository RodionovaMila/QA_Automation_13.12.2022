package com.hillel.lessons.lesson7;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String guessNumber = "Угадай число: ";
    private static final String Congratulation = "Поздравляем!!! Вы выиграли!";
    private static final int attemptsNumber = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        final int randomNumber = random.nextInt(10);
        int usersNumber;

        for (int i = 0; i < attemptsNumber; i++) {
            System.out.println(guessNumber);

        while (!scanner.hasNextInt()) {
          System.out.print("Пожалуйста, введите целое число: ");
          scanner.next();
          }
            usersNumber = scanner.nextInt();

            if (randomNumber == usersNumber) {
                System.out.println(Congratulation);
                break;

            } else
                System.out.println(usersNumber > randomNumber ? "Моё число меньше" : "Моё число больше");
        }
        System.out.printf("Загаданное число %d%n", randomNumber);
    }
}


//    public class GuessTheNumber {
//    public static void main(String[] args) {
//        int minNumber = 0;
//        int maxNumber = 10;
//        int numberOfAttempts = 3;
//
//        Random random = new Random();
//        int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
//
//        System.out.println("Я загадал число от " + minNumber + " до " + maxNumber + ".");
//        System.out.println("У вас есть " + numberOfAttempts + " попытки, чтобы отгадать его.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 1; i <= numberOfAttempts; i++) {
//            System.out.print("Попытка " + i + ": ");
//
//            while (!scanner.hasNextInt()) {
//                System.out.print("Пожалуйста, введите целое число: ");
//                scanner.next();
//            }
//
//            int guess = scanner.nextInt();
//
//            if (guess == secretNumber) {
//                System.out.println("Поздравляю! Вы отгадали число.");
//                return;
//            } else {
//                System.out.println("Вы не угадали.");
//                if (guess < secretNumber) {
//                    System.out.println("Загаданное число больше.");
//                } else {
//                    System.out.println("Загаданное число меньше.");
//                }
//            }
//        }
//
//        System.out.println("Вы исчерпали все попытки. Загаданное число было " + secretNumber + ".");
//    }
//}