package org.example.model;

/**
 * Store: ürünleri listeler ve main içinde kısa demo yapar.
 */
public class Store {

    // products dizisini gez ve showDetails() çağır
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            p.showDetails();
        }
    }

    // Mini demo
    public static void main(String[] args) {
        ProductForSale[] items = new ProductForSale[] {
                new Chocolate("dark", 95.0, "70% cocoa bar", 70),
                new Coke("coke", 35.0, "classic cola", 330, false),
                new Bread("loaf", 28.0, "whole-wheat daily bread", "whole-wheat", false)
        };

        listProducts(items);

        // Öğretici: satış fiyatı nasıl bulunur?
        int qty = 3;
        System.out.println("Total for " + qty + " chocolates = " + items[0].getSalesPrice(qty));
    }
}
