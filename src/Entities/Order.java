package Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Product> selectedProducts = new ArrayList<>();

    public List<Product> getSelectedProducts() {
        return selectedProducts;
    }

}
