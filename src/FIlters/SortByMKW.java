package FIlters;

import Data.Property;

import java.util.Comparator;

public class SortByMKW implements Comparator <Property> {
    @Override
    public int compare(Property o1, Property o2) {
        if (o1.getPricePerSquare() > o2.getPricePerSquare())
            return 1;
        if (o1.getPricePerSquare() < o2.getPricePerSquare())
            return -1;
        return 0;
    }
}
