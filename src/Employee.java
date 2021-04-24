import java.io.*;
import java.util.*;

class Employee extends Person {
    private float salary;
    private Vector<Item> recorded_items;
    private Vector<Integer> recorded_quantities;

    public Employee(String firstname, String lastname, String phone, float salary) {
        super(firstname, lastname, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void recordItems(Vector<Item> items, Vector<Integer> quantities) {
        recorded_items = new Vector<Item>();
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getQuantity() -  quantities.get(i) < 0) {
                System.out.println(items.get(i).getName() + " is out of stock and couldnt be added!");
                continue;
            }
            recorded_items.addElement(items.get(i));
            recorded_quantities.addElement(quantities.get(i));
            items.get(i).reduceItems(quantities.get(i));
        }

        System.out.println("Items were added successfully!");

    }

    public Transaction add_items_to_transaction(Transaction t) {
        Transaction_details td = new Transaction_details(recorded_items, recorded_quantities);
        t.setDetails(td);

        System.out.println("Items were added to transaction");

        return t;
    }

    public void generateReciet(Transaction t) {
        System.out.println("Generating Reciet: ");
        t.printReciet();
    }
}