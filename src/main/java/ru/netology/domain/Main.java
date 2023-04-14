package ru.netology.domain;

import ru.netology.domain.Book;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        manager.add(new Book(505, "Война и мир", 250, "Толстой Л.Н."));
        manager.add(new Book(510, "Капитанская Дочка", 400, "Пушкин А.С."));
        manager.add(new Smartphone(20, "Samsung S20", 45000, "Samsung Electronics"));
        manager.add(new Smartphone(12, "Apple iPhone 12", 60000, "Apple Inc"));

        Product[] result = manager.findByQuery("ин");

        ProductRepository repo = new ProductRepository();
        repo.save(new Book(505, "Война и мир", 250, "Толстой Л.Н."));
        repo.save(new Book(510, "Капитанская Дочка", 400, "Пушкин А.С."));
        repo.save(new Smartphone(20, "Samsung S20", 45000, "Samsung Electronics"));
        repo.save(new Smartphone(12, "Apple iPhone 12", 60000, "Apple Inc"));

        repo.removeById(505);
        Product[] all = repo.findAll();
    }
}
