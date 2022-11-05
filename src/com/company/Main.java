package com.company;
import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Chatot("кореш", 10);
        Pokemon p2 = new Pumpkaboo("парадеевич", 10);
        Pokemon p3 = new Gourgeist("эксайл", 10);
        Pokemon p4 = new Marill("плохой парень", 10);
        Pokemon p5 = new Azurill("куертов", 10);
        Pokemon p6 = new Azumarill("фраме тамер", 10);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
