package com.company;
import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) * 3 / 512.0D > Math.random()) {
            System.out.println("критический удар!");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
    @Override
    protected String describe() {
        return "шанс критического удара увеличивается в 3 раза";
    }
}
