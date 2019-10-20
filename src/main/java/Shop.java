import accessories.Accessories;
import behaviours.ISell;
import instruments.Instrument;

import java.util.HashMap;

public class Shop {

        private String name;
    private HashMap<ISell, Integer> stock;
    private Instrument instrument;
    private Accessories accessories;


    public Shop(String name){
        this.stock = new HashMap<ISell, Integer>();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void addStock(ISell item){
        if(stock.containsKey(item)){
            stock.put(item, stock.get(item) +1);
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

    public Double getTotalStockPrice() {
        double totalCost = 0;
        for (ISell item : stock.keySet()) {
            double price = stock.get(item) * item.getStockPrice();
            totalCost += price;
        }
        return totalCost;

    }

}
