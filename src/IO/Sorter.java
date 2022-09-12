package IO;

import Data.Property;
import FIlters.SortByMKW;
import Interfaces.Printer;

import java.util.Arrays;

public class Sorter implements Printer {
    SortByMKW sorting = new SortByMKW();
    public void Sorter(Property[] properties){
      Arrays.sort(properties, sorting);
        for (Property property : properties) {
           print(property);
        }
    }
}
