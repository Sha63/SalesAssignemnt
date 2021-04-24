import java.io.*;
import java.util.*;

class Customer extends Person{
    private long creditNo;
    private Vector<Item> items;
    private Vector<Integer> quantiies;

    public Customer(String firstname, String lastname, String phone, long creditNo) {
        super(firstname, lastname, phone);
        this.creditNo = creditNo;
        items = new Vector<Item>();
        quantiies = new Vector<Integer>();
    }

    public long getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(long creditNo) {
        this.creditNo = creditNo;
    }

    public void addItems(Item i, int quantity) {
        items.addElement(i);
        quantiies.addElement(quantity);
        System.out.println(i.getName() + " was added!");
    }

    public Transaction checkout() {
        Payment p = choosePayment();
        Transaction t = new Transaction(this, p);
        System.out.println("Customer is checking out");
        return t;
    }

    public Payment choosePayment() {
        Payment p = new Payment("Credit Card");
        System.out.println(p.getType() + "was chosen as payment method!");
        return p;
    }
}