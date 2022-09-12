package Interfaces;

public interface Printer {

    default void print(String txt){
        System.out.println(txt);
    }
    default void print(int i){
        System.out.println(i);
    }
    default  void print(double d){
        System.out.println(d);
    }
    default void print(Object o){
        System.out.println(o.toString());
    }
}
