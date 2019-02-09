package ch02.ex15;


import java.util.ArrayList;

public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice){
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }
    }
    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public void add(String description, int quantity, double unitPrice){
        Item newItem = new Item(description, quantity, unitPrice);
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    @Override
    public String toString() {
        String retString = "";
        retString += String.format("Faktura VAT\n");
        retString += String.format("Lista produktów:\n");
        retString += String.format("\tOpis\t\t\tIlość\tCena jedn.\tCena całkowita\n");

        double unitSum = 0;
        double priceSum = 0;
        for(Item item : this.items) {
            retString += String.format("\t%s\t%d\t\t%.2f\t\t%.2f\n", item.description, item.quantity, item.unitPrice, item.price());
            unitSum += item.unitPrice;
            priceSum += item.price();
        }

        retString += String.format("\t---------------------------------------------------\n");
        retString += String.format("\tSuma:\t\t\t\t\t%.2f\t\t%.2f\n", unitSum, priceSum);

        return retString;
    }
}
