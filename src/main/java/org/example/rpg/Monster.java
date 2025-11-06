package org.example.rpg;

/**
 * Abstraction: Tüm canavarların ortak şablonu.
 * - name: Görsel/Tanımlayıcı ad
 * - hitPoints: Can puanı (örnek amaçlı; saldırı hesabında kullanılmıyor)
 * - damage: Temel saldırı hasarı
 *
 * Polimorfik davranış: attack()
 * - Temel hasar + (varsa) bleed() + (varsa) poison()
 * - Bleed/Poison özellikleri interface ile esnek şekilde eklenir.
 */
public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    /**
     * Toplam saldırı hasarı:
     *   damage + bleed (varsa) + poison (varsa)
     * Runtime'da hangi interface'leri desteklediğine göre şekillenir.
     */
    public double attack() {
        double total = getDamage();

        // Java 17 pattern matching (IDE ayarına göre klasik instanceof + cast de yazılabilir)
        if (this instanceof Bleedable b) {
            total += b.bleed();    // kural: getDamage() * 0.25
        }
        if (this instanceof Poisonable p) {
            total += p.poison();   // kural: getDamage() * 0.30
        }
        return total;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + "', hp=" + hitPoints + ", dmg=" + damage + "}";
    }
}
