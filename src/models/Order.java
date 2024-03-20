package models;

import enums.OrderStatus;

import java.time.LocalDate;

public class Order {
    private int id;
    private Customer customer;
    private Addressee addressee;
    private double weight;
    private double size;
    private LocalDate date;
    private OrderStatus status;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Addressee getAddressee() {
        return addressee;
    }

    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Заказ:\n" +
                "id = "+id+
                "\nОтправитель : " + customer.toString() +
                "\nПолучатель : " + addressee.toString() +
                "\nВес = " + weight +
                "\nРазмер = " + size +
                "\nДата = " + date +
                "\nСтатус = " + status +
                "\nСтоимость = " + price ;
    }
}
