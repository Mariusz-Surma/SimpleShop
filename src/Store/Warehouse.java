package Store;

import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {


        private static List<Product> memoryProducts = new ArrayList<>();

        public static void addProduct(Product product) {
            memoryProducts.add(product);
        }


        public static void checkMemoryProducts() {
            System.out.println("W magazynie jest: " + memoryProducts.size() + " produktów");
            for (int i = 0; i < memoryProducts.size(); i++) {
                Product product = memoryProducts.get(i);
                System.out.println(product.toString(i + 1));
            }

        }


        public static void removeProduct(String productName) {
            boolean isRemove = memoryProducts.removeIf(p -> p.getName().equals(productName));
            if (isRemove){
                System.out.println("usunięto produkt:" + productName);
            }
            else {
                System.out.println("podano złą nazwę produktu");
            }

        }

    }

