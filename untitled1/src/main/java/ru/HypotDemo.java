package ru;

public class HypotDemo {
    public static void main(String[] args) {
        double cathetusi, cathetusi2, hypot;

        cathetusi = 3; // длина первого катета
        cathetusi = 4; // длина второго катета

        hypot = Match.sqrt((cathetusi * cathetusi) + (cathetusi2 * cathetusi2));
        System.out.println("длина гипотенузы равна " + hypot);
    } // main(String[])
} // class HypotDemo
