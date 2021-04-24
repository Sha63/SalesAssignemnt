import java.io.*;
import java.util.*;

class Transaction {
    private Customer customer;
    private Employee employee;
    private Transaction_details details;
    private Payment payment;
    private float reciestNo;

    public Transaction(Customer customer, Payment payment) {
        this.customer = customer;
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public float getReciestNo() {
        return reciestNo;
    }

    public Payment getPayment() {
        return payment;
    }

    public Transaction_details getDetails() {
        return details;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDetails(Transaction_details details) {
        this.details = details;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setReciestNo(float reciestNo) {
        this.reciestNo = reciestNo;
    }

    public void printReciet() {
        System.out.println("Reciet for " + customer.getFirstname() + " " + customer.getLastname());
        System.out.println("Printed by " + employee.getFirstname() + " " + employee.getLastname());
        details.printDetails();
    }
}