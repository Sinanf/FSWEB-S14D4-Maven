package org.example.model;


/**
 * Örnek ürün: Ekmek
 * - Kendine özgü alan: un tipi ve gluten durumu
 */
public class Bread extends ProductForSale {
    private String flourType;   // örn: whole-wheat
    private boolean glutenFree;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }
    public Bread(String type, double price, String description, String flourType, boolean glutenFree) {
        super(type, price, description);
        this.flourType = flourType;
        this.glutenFree = glutenFree;
    }

    public String getFlourType() {
        return flourType;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread { " +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", flourType='" + flourType + '\'' +
                ", glutenFree=" + glutenFree +
                " }");
    }
}
