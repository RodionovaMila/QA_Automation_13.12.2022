package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String name1 = "Team1";
        String name2 = "Team2";

        String Team1 = scanner.nextLine();
        System.out.println("Team1 = " + Team1);
        String Team2 = scanner.nextLine();
        System.out.println("Team2 = " + Team2);

//        scanner.nextLine();


        int team1Player1 = 0;
        int team1Player2 = 0;
        int team1Player3 = 0;
        int team1Player4 = 0;
        int team1Player5 = 0;
        int team2Player1 = 0;
        int team2Player2 = 0;
        int team2Player3 = 0;
        int team2Player4 = 0;
        int team2Player5 = 0;

        if (scanner.hasNextInt()) {
            team1Player1 = scanner.nextInt();
            System.out.println("team1Player1 = " + team1Player1);
        }
        if (scanner.hasNextInt()) {
            team1Player2 = scanner.nextInt();
            System.out.println("team1Player2 = " + team1Player2);
        }
        if (scanner.hasNextInt()) {
            team1Player3 = scanner.nextInt();
            System.out.println("team1Player3 = " + team1Player3);
        }
        if (scanner.hasNextInt()) {
            team1Player4 = scanner.nextInt();
            System.out.println("team1Player4 = " + team1Player4);
        }
        if (scanner.hasNextInt()) {
            team1Player5 = scanner.nextInt();
            System.out.println("team1Player5 = " + team1Player5);
        }
        if (scanner.hasNextInt()) {
            team2Player1 = scanner.nextInt();
            System.out.println("team2Player1 = " + team2Player1);
        }
        if (scanner.hasNextInt()) {
            team2Player2 = scanner.nextInt();
            System.out.println("team2Player2 = " + team2Player2);
        }
        if (scanner.hasNextInt()) {
            team2Player3 = scanner.nextInt();
            System.out.println("team2Player3 = " + team2Player3);
        }
        if (scanner.hasNextInt()) {
            team2Player4 = scanner.nextInt();
            System.out.println("team2Player4 = " + team2Player4);
        }
        if (scanner.hasNextInt()) {
            team2Player5 = scanner.nextInt();
            System.out.println("team2Player5 = " + team2Player5);

        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        double resultTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5.0;
        double resultTeam2 = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5.0;

        System.out.println("Cереднє арифметичне балів команди Team1: " + resultTeam1);
        System.out.println("Cереднє арифметичне балів команди Team2: " + resultTeam2);

        if (resultTeam2 > resultTeam1) {
            System.out.println("Перемогла команда " + name2 + " набрала " + resultTeam1 + " очків");
        } else if (resultTeam2 == resultTeam1) {
            System.out.println("Нічия");
        } else {
            System.out.println("Перемогла команда " + name1 + " набрала " + resultTeam1 + " очків");
        }

    }
}