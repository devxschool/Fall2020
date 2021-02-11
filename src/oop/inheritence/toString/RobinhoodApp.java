package oop.inheritence.toString;

import java.util.ArrayList;
import java.util.List;

public class RobinhoodApp {

    public static void main(String[] args) {
        Stock tsla= new Stock(861.12,"TSLA",7_000_000_000_000.00);
        System.out.println(tsla);
    }
    public static void print(Stock stock) {
        System.out.println(stock.getSymbol());
        System.out.println(stock.getCloseHigh());
        System.out.println(stock.getVolume());
    }

}
