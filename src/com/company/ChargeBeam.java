package com.company;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.7) {
            System.out.println("спец атака повышена на одну ступень");
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
    @Override
    protected String describe() {
        return "имеет 70% вероятность повысить свою спец атаку на одну ступень";
    }
}
