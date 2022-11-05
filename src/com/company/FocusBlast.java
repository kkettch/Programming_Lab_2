package com.company;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.GRASS, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            System.out.println("защита противника понижена на 1 ступень");
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "понижает спец защиту противника на 1 ступень с вероятностью в 10%";
    }
}