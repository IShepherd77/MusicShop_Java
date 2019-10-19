package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String type;
    private String colour;
    private int stockPrice;
    private int sellPrice;

    public Instrument(String type, String colour, int stockPrice, int sellPrice) {
        this.type = type;
        this.colour = colour;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
