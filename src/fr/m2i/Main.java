package fr.m2i;

public class Main {

    public static void main(String[] args) {

        Soldier matteo = new Soldier("Mettéo", 100, 78, 45);
        Wizard cecile = new Wizard("Cécile", 89, 95, 68);

        cecile.move();
        cecile.attack(matteo);
    }
}