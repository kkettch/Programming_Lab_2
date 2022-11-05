package com.company;
import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Status.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status pok = def.getCondition();
        if (pok.equals(BURN) || pok.equals(PARALYZE) || pok.equals(POISON)) {
            System.out.println("сила удвоена");
            def.setMod(Stat.HP, (int) (Math.round(damage) * 2));
        }
    }
    @Override
    protected String describe() {
        return "удваивает силу, если использующий обожжён, парализован или отравлен";
    }
}
