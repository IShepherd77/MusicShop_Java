package accessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {
    private String description;
    private double stockPrice;
    private double sellPrice;

    public Accessories(String description, double stockPrice, double sellPrice){
        this.description = description;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

}
