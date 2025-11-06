package org.example.rpg;

/**
 * Kurtadam: Sadece kanatma etkisi uygular.
 * - Bleedable: bleed = damage * 0.25
 * - Poison yok.
 */
public class Werewolf extends Monster implements Bleedable {

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}
