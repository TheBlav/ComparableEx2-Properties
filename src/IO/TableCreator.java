package IO;

import Data.Property;
import File.FileLoader;
import Interfaces.Printer;


import java.io.IOException;

public class TableCreator implements Printer {
    String[] splitted = new String[3];
    int rows;

    public Property[] TableCreator() throws IOException{
        FileLoader fl = new FileLoader();
        Property[] properties;

        String[] test = fl.FileLoader();

        for (int i = 0; i < test.length; i++) {
            if (test[i] != null)
//                    print(test[i]+"\n");
                rows++;
        }
        properties = new Property[rows];
        for (int i = 0; i < rows; i++) {
            splitted = test[i].split(";");

            int price = Integer.parseInt(splitted[1]);
            int area = Integer.parseInt(splitted[2]);
            double pricePerSquare = (double) price / (double) area;
            properties[i] = new Property(splitted[0], price, area, pricePerSquare);

        }
        return properties;
    }
}



