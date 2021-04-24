import java.io.*;
import java.util.*;

class Transaction_details {
    private Vector<Item> items;
    private Vector<Integer> quantities;

    public Transaction_details(Vector<Item> items, Vector<Integer> quantities) {
        this.items = items;
        this.quantities = quantities;
    }

    public void printDetails() {
        int total = 0;
        float tax = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " ...... " + quantities.get(i) + " ...... " + items.get(i).getPrice());
            total += (quantities.get(i) * items.get(i).getPrice());
        }

        System.out.println("Sum ................. " + total);
        tax = 14*total/100;
        System.out.println("Tax ................. " + tax);

        System.out.println("Total ............... " + (total + tax));
    }
}