package MenuItems;

import Store.Warehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Store.Warehouse.checkMemoryProducts;

public class RemoveProductMenuItem implements MenuItem{

    private String name;

    public RemoveProductMenuItem(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Który produkt chcesz usunąć?");
        checkMemoryProducts();
        System.out.println("Wpisz nazwę produktu do usunięcia");
        String productName = bf.readLine();
        Warehouse.removeProduct(productName);




    }
}
