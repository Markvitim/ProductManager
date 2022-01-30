package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    public void getAndSetAuthor() {
        Book book = new Book();
        book.setAuthor("Петров");
        Assertions.assertEquals("Петров", book.getAuthor());

    }

}