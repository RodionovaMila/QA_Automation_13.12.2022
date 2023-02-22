package com.hillel.lessons.lesson10;

    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;


    public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Запрос размеров матрицы у пользователя
        System.out.print("Введите количество строк: ");
        while (!input.hasNextShort()) {
            System.out.print("Пожалуйста, введите целое число: ");
            input.next();
            }
        short m = input.nextShort();

        System.out.print("Введите количество столбцов: ");
        while (!input.hasNextShort()) {
            System.out.print("Пожалуйста, введите целое число: ");
            input.next();
            }
        short n = input.nextShort();

        // Создание матрицы
        short[][] matrix = new short[m][n];

        // Заполнение матрицы данными от пользователя
        System.out.println("Введите данные матрицы:");
        while (!input.hasNextShort()) {
            System.out.print("Пожалуйста, введите целое число: ");
            input.next();
        }
        for (short i = 0; i < m; i++) {
            for (short j = 0; j < n; j++) {
                matrix[i][j] = input.nextShort();
            }
        }

        // Транспонирование матрицы
        short[][] transposedMatrix = new short[n][m];
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < m; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        for (short i = 0; i < m; i++) {
            for (short j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Вывод транспонированной матрицы
        System.out.println("Транспонированная матрица:");
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}