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
 * @author Patrick Heintz
 * Class for the individual trader (different leaders)
 * Able to modify, add/subtract to, and search the list
 * 
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
        traderGoodsList.add(new Goods("Cheese", "Kilograms", GameData.cheese));
        traderGoodsList.add(new Goods("Fish", "Kilograms", GameData.fish));
        traderGoodsList.add(new Goods("Shoes", "Pairs", GameData.shoes));
        
        /** Africa */
        traderGoodsList.add(new Goods("Cocoa", "Kilograms", GameData.cocoa));
        traderGoodsList.add(new Goods("Cotton", "Kilograms", GameData.cotton));
        traderGoodsList.add(new Goods("Gold", "Troy Ounces", GameData.gold));
        
          /** Asia */
        traderGoodsList.add(new Goods("Rice", "Metric Tons", GameData.rice));
        traderGoodsList.add(new Goods("Rubber", "Metric Tons", GameData.rubber));
        traderGoodsList.add(new Goods("Steel", "Metric Tons", GameData.steel));
        
           /**Aussieland */
        traderGoodsList.add(new Goods("Aluminium", "Metric Tons", GameData.aluminium));
        traderGoodsList.add(new Goods("Coal", "Metric Tons", GameData.coal));
        traderGoodsList.add(new Goods("Wool", "Kilograms", GameData.wool));
        
           /** North America */
        traderGoodsList.add(new Goods("Beef Cattle", "Pounds", GameData.beef));
        traderGoodsList.add(new Goods("Lumber", "Board Feet", GameData.lumber));
        traderGoodsList.add(new Goods("Wheat", "Metric Tons", GameData.wheat));
        
        /** South America */
        traderGoodsList.add(new Goods("Bananas", "Metric Tons", GameData.bananas));
        traderGoodsList.add(new Goods("Coffee", "Kilograms", GameData.coffee));
        traderGoodsList.add(new Goods("Crude Oil", "Barrels", GameData.oil));
    }
    
    /**
     * display goods that are 'in stock' ( greater than zero )
     */
    void showGoods()
    {
        Iterator<Goods> itr = traderGoodsList.iterator();
        Goods temp;
        while(itr.hasNext())
        {
            temp = itr.next();
            if(temp.quantity > 0)
            {
                System.out.print(temp.name + ": " + temp.quantity + " "
                + temp.units + "\n");
            }
        }
    }
    
    /**
     * add to a particular trader's inventory of goods
     * @param good  name of good
     * @param amount amount to be added to stock
     */
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
    
    /**
     * Used for trade interactions.  As long as there is enough to subtract,
     * the trade will go through.  Otherwise return false.  A prerequisite to 
     * the addAmount function.
     * 
     * @param good
     * @param amount
     * @return 
     */
    boolean subtractAmount(String good, int amount)
    {
        Iterator<Goods> itr = traderGoodsList.iterator();
        Goods tempGood;
        
        while(itr.hasNext())
        {
            tempGood = itr.next();
            if(tempGood.name.equals(good))
            {
                if(tempGood.quantity > amount)
                {
                    tempGood.quantity -= amount;
                    return true;
                }
                else
                    return false;
            }     
        }
        return false;
    }

    /**
     * Search goods list for a string that matches the param
     * @param tradedGood is the Goods to search for.
     * @return 
     */
    Goods findGood(String tradedGood) 
    {
        
        Iterator<Goods> itr = traderGoodsList.iterator();
        Goods tempGood;
        
        while(itr.hasNext())
        {
            tempGood = itr.next();
            if(tempGood.name.equals(tradedGood))
            {
                return tempGood;
            }     
        }
        
        tempGood = new Goods("bad", "bad", -1);
        return tempGood;
    }
    
}
