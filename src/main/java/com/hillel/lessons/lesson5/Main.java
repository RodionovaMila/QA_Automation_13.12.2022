package com.hillel.lessons.lesson5;

public class Main {
    public static void main(String[] args) {

        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;

        int warriorMin = 9;
        int bowmanLiMin = 35;
        int riderLiMin = 12;

        System.out.println();

        int Li = 860;
        double Min = Li * 1.5;

        System.out.println("double Min = " + Li * 1.5 );

        double generalIndexLi = (warriorLi + bowmanLi + riderLi) / 3.0;
        double generalIndexMin = (warriorMin + bowmanLiMin + riderLiMin) / 3.0;

        System.out.println ("generalIndexLi = " + (Math.round(generalIndexLi)));
        System.out.println("generalIndexMin = " + (Math.round(generalIndexMin)));

        double generaLi = (Li / generalIndexLi);
        double generaMin = (Min / generalIndexMin);

        System.out.println("generaLi = " + (Math.round(Li / generalIndexLi)));
        System.out.println("generaMin = " + (Math.round(Min / generalIndexMin)));

        System.out.println("Winner = " + (Math.round(generaMin)));




        
    }






}
