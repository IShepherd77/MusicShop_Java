package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;


    public Guitar(String type, String colour, int stockPrice, int sellPrice, int numOfStrings){
        super(type, colour, stockPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }




}
