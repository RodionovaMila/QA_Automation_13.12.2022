package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name1 = "Team1";
        String name2 = "Team2";

        int team1Player1 = 5;
        int team1Player2 = 7;
        int team1Player3 = 9;
        int team1Player4 = 13;
        int team1Player5 = 20;



        int team2Player1 = 3;
        int team2Player2 = 6;
        int team2Player3 = 8;
        int team2Player4 = 11;
        int team2Player5 = 18;


        double resultTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5.0;
        double resultTeam2 = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5.0;


        System.out.println("Cереднє арифметичне балів команди Team1: " + resultTeam1);
        System.out.println("Cереднє арифметичне балів команди Team2: " + resultTeam2);

        if (resultTeam2 > resultTeam1){
            System.out.println("Перемогла команда "  + name2 + " набрала " + resultTeam1 + " очків");
        } else {
            System.out.println("Перемогла команда "  + name1 + " набрала " + resultTeam1 + " очків");
        }
           }
    }




