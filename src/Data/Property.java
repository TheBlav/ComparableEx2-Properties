package Data;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Objects;

public class Property implements Comparable<Property> {
    private String city;
    private int price;
    private int area;
    private double pricePerSquare;

    public Property(String city, int price, int area, double pricePerSquare) {
        this.city = city;
        this.price = price;
        this.area = area;
        this.pricePerSquare = pricePerSquare;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(double pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return price == property.price && area == property.area && Double.compare(property.pricePerSquare, pricePerSquare) == 0 && Objects.equals(city, property.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, price, area, pricePerSquare);
    }
    DecimalFormat df = new DecimalFormat("0.00");
    @Override
    public String toString() {
        return city + ", " + (double) price + "zł, " + (double) area + "mkw, " + df.format(pricePerSquare) + "zł/mkw";

    }

    @Override
    public int compareTo(Property o) {
        return 0;
    }
}
