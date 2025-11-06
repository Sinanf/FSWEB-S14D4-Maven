package org.example.rpg;

/**
 * Örnek karma tür: Hem Bleedable hem Poisonable.
 * - bleed = damage * 0.25
 * - poison = damage * 0.30
 */
public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.30;
    }
}
