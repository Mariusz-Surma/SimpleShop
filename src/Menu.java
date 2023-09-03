import MenuItems.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

        public final List<MenuItem> options = new ArrayList<>();

        public Menu() {
            options.addAll(Arrays.asList(new AddProductMenuItem("1) Dodaj Produkt"),
                    new CreateOrderMenuItem("2) Zrób zamówienie"),
                    new CheckProductsMenuItem("3) Sprawdź magazyn"),
                    new RemoveProductMenuItem("4) Usuń produkt"),
                    new ExitProgramMenuItem("5) Zakończ Program")));
        }

        public void openMenu() {
            System.out.println("Witamy w programie...");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int selectedOption = -1;
            while (selectedOption != 4) {
                this.showBasicMenu();
                try {
                    String readline = bf.readLine();
                    selectedOption = Integer.parseInt(readline) - 1;
                    MenuItem selectedMenuItem = options.get(selectedOption);

                    System.out.print("Twoja opcja: ");
                    selectedMenuItem.execute();
                } catch (NumberFormatException ex) {
                    System.err.println("Wybrano niepoprawną opcje, wpisz opcję jeszcze raz ;)");
                } catch (IOException ex) {
                    System.err.println(ex.getCause().toString());
                }
            }
        }

        public void showBasicMenu() {
            System.out.println("Wybierz opcje");
            for (MenuItem option : options) {
                System.out.println(option.getName());
            }
        }

    }

