package com.company;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            System.out.println("цель подожжена");
            Effect.burn(pokemon);
        }
    }
    @Override
    protected String describe() {
        return "поджигает цель с вероятностью 30%";
    }
}
