package org.example.rpg;

/**
 * Kanatma yeteneği olan canavarlar bunu implement eder.
 * Proje kuralı: bleed hasarı = getDamage() * 0.25
 */
public interface Bleedable {
    double bleed();
}
