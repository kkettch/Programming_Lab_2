package com.company;
import ru.ifmo.se.pokemon.*;

public class HyperVoice extends SpecialMove {
    public HyperVoice() {
        super(Type.NORMAL, 90, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "наносит обычные повреждения без дополнительных эффектов";
    }
}
