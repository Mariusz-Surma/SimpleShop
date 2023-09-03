package MenuItems;

public class CreateOrderMenuItem implements MenuItem{

    private String name;

    public CreateOrderMenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() {
        System.out.println(this.getName());
        System.out.println("Złożono zamówienie!");
    }
}
