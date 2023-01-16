package com.hillel.lessons.lesson10;

    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

         Scanner str = new Scanner(System.in);
         int x = str.nextInt();
         int a[][] = new int[x][];
         for (int n = 0; n < a.length; n++) {
             a[n] = new int[x];
             for (int m = 0; m < a[n].length; m++) {
                 a[n][m] = (int) (Math.random() * 100);
                 System.out.print(a[n][m] + "\t");
             }
             System.out.println();
         }

         for (int n = 0; n < a.length; n++) {
              for (int m = n + 1; m < a.length; m++) {
              int temp = a[n][m];
              a[n][m] = a[m][n];
              a[m][n] = temp;
                    }
                }


              System.out.println();
              System.out.println("Новая матрица");
              System.out.println("------");
                for (int n = 0; n < a.length; n++) {
                    for (int m = 0; m < a[n].length; m++) {
                        System.out.print(a[n][m] + "\t");
                    }
              System.out.println();
                }
            }
        }