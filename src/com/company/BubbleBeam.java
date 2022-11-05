package com.company;
import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            System.out.println("скорость цели понижена на 10%");
            pokemon.setMod(Stat.SPEED, -1);
        }
    }
    @Override
    protected String describe() {
        return "имеет шанс 10 процентов понизить скорость цели на 1 ступень";
    }
}
