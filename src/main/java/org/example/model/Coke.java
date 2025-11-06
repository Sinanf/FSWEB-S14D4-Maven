package org.example.model;

/**
 * Örnek ürün: Kola
 * - Kendine özgü alan: hacim (ml) ve şekerli mi
 */
public class Coke extends ProductForSale {
    private int volumeMl;
    private boolean sugarFree;

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }

    public Coke(String type, double price, String description, int volumeMl, boolean sugarFree) {
        super(type, price, description);
        this.volumeMl = volumeMl;
        this.sugarFree = sugarFree;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke { " +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", volume=" + volumeMl + "ml" +
                ", sugarFree=" + sugarFree +
                " }");
    }
}
