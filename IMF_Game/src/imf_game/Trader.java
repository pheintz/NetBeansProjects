/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lloyd
 */
public class Trader {
    
    List<Goods> traderGoodsList = new ArrayList<>();
    String name;
    String region;   
    int money;
    
    /**
     * On creation build the list for the trader.
     * List includes not only the country's starting
     * goods, but also every available commodity
     * in the game world.
     */
    Trader(String n, String r, int m)
    {
        name = n;
        region = r;
        money = m;
        
        /** Europe */
        traderGoodsList.add(new Goods("Cheese", "Kilograms"));
        traderGoodsList.add(new Goods("Fish", "Kilograms"));
        traderGoodsList.add(new Goods("Shoes", "Pairs"));
        
        /** Africa */
        traderGoodsList.add(new Goods("Cocoa", "Kilograms"));
        traderGoodsList.add(new Goods("Cotton", "Kilograms"));
        traderGoodsList.add(new Goods("Gold", "Troy Ounces"));
        
          /** Asia */
        traderGoodsList.add(new Goods("Rice", "Metric Tons"));
        traderGoodsList.add(new Goods("Rubber", "Metric Tons"));
        traderGoodsList.add(new Goods("Steel", "Metric Tons"));
        
           /**Austrailia */
        traderGoodsList.add(new Goods("Aluminium", "Metric Tons"));
        traderGoodsList.add(new Goods("Coal", "Metric Tons"));
        traderGoodsList.add(new Goods("Wool", "Kilograms"));
        
           /** North America */
        traderGoodsList.add(new Goods("Beef Cattle", "Pounds"));
        traderGoodsList.add(new Goods("Lumber", "Board Feet"));
        traderGoodsList.add(new Goods("Wheat", "Metric Tons"));
        
        /** South America */
        traderGoodsList.add(new Goods("Bananas", "Metric Tons"));
        traderGoodsList.add(new Goods("Coffee", "Kilograms"));
        traderGoodsList.add(new Goods("Crude Oil", "Barrels"));
    }
    
    void addAmount(String good, int amount)
    {
        Iterator<Goods> itr = traderGoodsList.iterator();
        Goods tempGood;
        
        while(itr.hasNext())
        {
            tempGood = itr.next();
            if(tempGood.name.equals(good))
            {
                tempGood.quantity += amount;
            }     
        }
    }
    
    void subtractAmount(String good, int amount)
    {
        Iterator<Goods> itr = traderGoodsList.iterator();
        Goods tempGood;
        
        while(itr.hasNext())
        {
            tempGood = itr.next();
            if(tempGood.name.equals(good))
            {
                tempGood.quantity -= amount;
            }     
        }
    }
    
}
