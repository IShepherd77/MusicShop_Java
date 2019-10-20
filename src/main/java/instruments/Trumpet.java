package instruments;

public class Trumpet extends Instrument {

    private int numOfValves;

    public Trumpet(String type, String colour, double stockPrice, double sellPrice, int numOfValves){
        super("brass", colour, stockPrice, sellPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String getSound(){
      return  "Parp, parp!";
    }

    public double calculateMarkup() {
        return this.getStockPrice() *50 / 100;
    }



}
