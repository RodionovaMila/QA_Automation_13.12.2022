package com.hillel.lessons.lesson10;

    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;


public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int m = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m < 0) {
                    System.out.println("Ошибка: количество строк не может быть отрицательным.");
                    return;
                }
                break;
            } else {
                System.out.println("Ошибка: введено некорректное значение. Введите целое положительное число.");
                scanner.next();
            }
        }

        System.out.print("Введите количество столбцов: ");
        int n = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Ошибка: количество столбцов не может быть отрицательным.");
                    return;
                }
                break;
            } else {
                System.out.println("Ошибка: введено некорректное значение. Введите целое положительное число.");
                scanner.next();
            }
        }

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[n][m];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        matrix1[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Ошибка: введено некорректное значение. Введите целое число.");
                        scanner.next();
                    }
                }
            }
        }

        // Транспонирование матрицы
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


