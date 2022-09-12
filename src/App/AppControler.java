package App;


import Data.Property;
import IO.Sorter;
import IO.TableCreator;
import Interfaces.Printer;

import java.io.IOException;

public class AppControler implements Printer {
TableCreator tc = new TableCreator();
Property[] properties;
Sorter sort = new Sorter();
    public void AppControler() {
        try {
            print("Wczytano nieruchowmości: ");
            properties = tc.TableCreator();
            printProperties(properties);
            print("\n \nNierunomości posortowane wg. ceny za metr kwadratowy: ");
            sort.Sorter(properties);


    } catch ( IOException e) {
        System.err.println("Input mismatch exception");

    }
    }

    private void printProperties(Property[] properties) {
        for (Property property : properties) {
            print(property);
        }
    }
}
