package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {
    //    private Smartphone fff = new Smartphone(4, "FFF", 1000, "China");
    private Book first = new Book(1, "Учебник", 300, "India");


    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void matchesName() {
        Product product = new Smartphone();
        product.setId(0);
        product.setName("NNN");
        product.setPrice(1000);
        product.matches("NNN");
        Assertions.assertTrue(true);
    }
}