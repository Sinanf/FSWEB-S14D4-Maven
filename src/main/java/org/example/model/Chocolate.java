package org.example.model;

/**
 * Örnek ürün: Çikolata
 * - Kendine özgü alan: kakao oranı
 * - showDetails: hem üst sınıf hem özgün alanları gösterir
 */
public class Chocolate extends ProductForSale {
    private int cocoaPercent; // % kakao

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public Chocolate(String type, double price, String description, int cocoaPercent) {
        super(type, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() {
        return cocoaPercent;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate { " +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", cocoa%=" + cocoaPercent +
                " }");
    }
}
