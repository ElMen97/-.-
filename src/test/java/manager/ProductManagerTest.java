package manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    Book book1 = new Book(505, "Война и мир", 250, "Толстой Л.Н.");
    Book book2 = new Book(510, "Капитанская Дочка", 400, "Пушкин А.С.");
    Smartphone smartphone1 = new Smartphone(20, "Samsung S20", 45000, "Samsung Electronics");
    Smartphone smartphone2 = new Smartphone(12, "Apple iPhone 12", 60000, "Apple Inc");

    @Test
    public void test1ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("ин");
        Product[] expected = {book1, book2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("ша");
        Product[] expected = {smartphone1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("ни");
        Product[] expected = {smartphone2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("ив");
        Product[] expected = {smartphone1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("а");
        Product[] expected = {book1, smartphone1, smartphone2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test6ShouldFindElements() {
        ProductManager manager = new ProductManager();
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.findByQuery("яя");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }
}
