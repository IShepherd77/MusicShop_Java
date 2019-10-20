package accessories;

public class GuitarStrings extends Accessories {

    public GuitarStrings(String description, double stockPrice, double sellPrice){
        super(description, stockPrice, sellPrice);
    }

    public double calculateMarkup(){
        return this.getStockPrice() *20 / 100;
    }

}
