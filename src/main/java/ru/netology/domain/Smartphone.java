package ru.netology.domain;

import ru.netology.domain.Product;

public class Smartphone extends Product {

    public String producer;

    public Smartphone(int id, String title, int price, String producer) {
        super(id, title, price);
        this.producer = producer;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (producer.contains(query)) {
            return true;
        }
        return false;
    }
}
