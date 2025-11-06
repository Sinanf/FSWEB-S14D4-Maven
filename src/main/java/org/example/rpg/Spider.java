package org.example.rpg;

/**
 * Örümcek: Sadece zehir etkisi uygular.
 * - Poisonable: poison = damage * 0.30
 * - Bleed yok.
 */
public class Spider extends Monster implements Poisonable {

    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double poison() {
        return getDamage() * 0.30;
    }
}
