package ru.netology.domain;

public class Book extends Product {

    public String author;

    public Book(int id, String title, int price, String author) {
        super(id, title, price);
        this.author = author;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }

        if (author.contains(query)) {
            return true;
        }
        return false;
    }
}
