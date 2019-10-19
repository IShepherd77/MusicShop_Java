package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessories implements ISell {

    public GuitarStrings(String description, double stockPrice, double sellPrice){
        super(description, stockPrice, sellPrice);
    }

    public double calculateMarkup(){
        return this.getStockPrice() *20 / 100;
    }

}
