package MenuItems;

public class ExitProgramMenuItem implements MenuItem{

    private String name;

    public ExitProgramMenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute() {
        System.out.println(this.getName());
        System.out.println("Program zakończony!");
        System.exit(0);
    }
}
