package Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

    public String getName() {
        return name;
    }

    private String name;

    private BigDecimal price;


    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String toString(int idx) {
        return idx + ") Entities.Product " +
                "name =' " + name + '\'' +
                ", price = " + price +
                '}';
    }
}
