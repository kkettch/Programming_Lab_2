package com.company;
import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() <= 0.1) {
            System.out.println("скорость цели понижена на 1 ступень");
            pokemon.setMod(Stat.SPEED, -1);
        }
    }
    @Override
    protected String describe() {
        return "имеет 10% шанс понизить скорость цели на 1 ступень";
    }
}
