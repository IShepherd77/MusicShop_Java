package instruments;

public class Trumpet extends Instrument{

    private int numOfValves;

    public Trumpet(String type, String colour, int stockPrice, int sellPrice, int numOfValves){
        super("brass", colour, stockPrice, sellPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

}
