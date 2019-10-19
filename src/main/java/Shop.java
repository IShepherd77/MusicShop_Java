import behaviours.ISell;

import java.util.HashMap;

public class Shop {

        private String name;
    private HashMap<ISell, Integer> stock;


    public Shop(String name){
        this.stock = new HashMap<ISell, Integer>();
        this.name = name;
    }

    public String getName(){
        return this.name;
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

    public void removeItemFromStock(ISell item){
        if(stockCount(item) >= 1){
            stock.put(item, stock.get(item) -1);
        } else {
            stock.remove(item);
        }
    }
    
}
