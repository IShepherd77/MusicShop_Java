import behaviours.ISell;

import java.util.HashMap;

public class Shop {

    private HashMap<ISell, Integer> stock;

    public Shop(){
        this.stock = new HashMap<ISell, Integer>();
    }


    public void addStock(ISell item){
        if(stock.containsKey(item)){
            stock.put(item, 1+ stock.get(item));
        } else {
            stock.put(item, 1);
        }
    }

    public int stockCount(ISell item){
        if(stock.get(item) == null){
            return 0;
        }
        return stock.get(item);
    }


}
