package oop.inheritence.toString;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Stock {


    private double currentPrice;
    private String symbol;
    private long volume;
    private double marketCap;
    private double closeHigh;
    private double closeLow;


    public Map<LocalDate, Double> history = new HashMap();

    public Stock(double currentPrice, String symbol, double marketCap) {
        this.currentPrice = currentPrice;
        this.symbol = symbol;
        this.marketCap = marketCap;
    }


    public double getCurrentPrice() {
        return currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public long getVolume() {
        return volume;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public double getCloseHigh() {
        return closeHigh;
    }

    public double getCloseLow() {
        return closeLow;
    }

    //method for buy notification
    public void buy(){
        volume++;
        currentPrice += currentPrice*0.05;
    }

    public void sell(){
        volume--;
        currentPrice -= currentPrice*0.05;
    }




    @Override
    public String toString() {
        return "Stock{" +
                "currentPrice=" + currentPrice +
                ", symbol='" + symbol + '\'' +
                ", volume=" + volume +
                ", marketCap=" + marketCap +
                ", closeHigh=" + closeHigh +
                ", closeLow=" + closeLow +
                ", history=" + history +
                '}';
    }
}
