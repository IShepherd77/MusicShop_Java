package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;


    public Guitar(String type, String colour, double stockPrice, double sellPrice, int numOfStrings){
        super(type, colour, stockPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public String getSound(){
        return "bumchickawahwah";
    }


    public int getNumOfStrings() {
        return this.numOfStrings;
    }
}
