package ru.netology.domain;

public class Product {
    protected int id;
    protected String title;
    protected int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }
}
