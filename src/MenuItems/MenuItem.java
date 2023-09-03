package MenuItems;

import java.io.IOException;

public interface MenuItem {
    String getName();

    void execute() throws IOException;
}
