package com.company;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Status.*;

public class Refresh extends StatusMove {
    public Refresh(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.equals(BURN) || pokemon.equals(PARALYZE) || pokemon.equals(POISON)) {
            pokemon.setCondition(new Effect().condition(Status.NORMAL));
        }
    }
    @Override
    protected String describe() {
        return "исцеляется от ожога, паралича или отравления";
    }
}
