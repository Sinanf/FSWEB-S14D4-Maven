package org.example.rpg;

/**
 * Zehirleme yeteneği olan canavarlar bunu implement eder.
 * Proje kuralı: poison hasarı = getDamage() * 0.30
 */
public interface Poisonable {
    double poison();
}
