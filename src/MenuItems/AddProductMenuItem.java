package MenuItems;

import Entities.Product;
import Store.Warehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AddProductMenuItem implements MenuItem{

    private String name;

    public AddProductMenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz nazwę produktu");
        String productName = bf.readLine();
        System.out.println("Wpisz cenę produktu");
        String productPrice = bf.readLine();
        System.out.println("Czy utworzyć dany produkt? " + productName + " " + productPrice + " T/N");
        String response = bf.readLine();
        List<String> available = Arrays.asList("t", "n");
        if (available.contains(response.toLowerCase())) {
            if ("t".equals(response.toLowerCase())) {
                Warehouse.addProduct(new Product(productName, new BigDecimal(productPrice)));
                System.out.println("Dodano produkt!");
            } else {
                System.out.println("Nie dodano produktu");
            }
        } else {
            System.out.println("Wybrano niepoprawną opcję");
        }
    }
}
