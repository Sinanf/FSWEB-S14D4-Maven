package org.example.model;

/**
 * Ortak şablon: Abstraction
 * - Tüm ürünler için ortak alanlar ve davranışlar burada
 * - showDetails() soyut: her ürün kendi detayını bastırır
 */
public abstract class ProductForSale {
    // Gereksinim: 3 private değişken
    private String type;
    private double price;
    private String description;

    // Tek constructor: 3 alanı set eder
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getter'lar
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // quantity * price döner
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // Soyut yöntem: her alt sınıf kendine göre detay bastırır
    public abstract void showDetails();
}
