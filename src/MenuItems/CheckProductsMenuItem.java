package MenuItems;

import Store.Warehouse;

import java.io.IOException;

public class CheckProductsMenuItem implements MenuItem{

    private String name;

    public CheckProductsMenuItem(String name) {
        this.name = name;
    }

    public CheckProductsMenuItem() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() throws IOException {
        Warehouse.checkMemoryProducts();
    }
}
