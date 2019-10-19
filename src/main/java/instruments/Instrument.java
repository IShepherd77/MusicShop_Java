package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String type;
    private String colour;
    private double stockPrice;
    private double sellPrice;

    public Instrument(String type, String colour, double stockPrice, double sellPrice) {
        this.type = type;
        this.colour = colour;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
