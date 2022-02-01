package ru.netology.domain;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private int price;
    private Product product;


    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public boolean matches(String search) {
        return this.name.contains(search);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return id == product1.id && price == product1.price && Objects.equals(name, product1.name) && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, product);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", product=" + product +
                '}';
    }
}
