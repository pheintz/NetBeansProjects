/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lloyd
 */
public class Trader {
    
    List<Goods> traderGoodsList = new ArrayList<>();
    String region;   
    int money;
    
    /**
     * On creation build the list for the trader.
     * List includes not only the country's starting
     * goods, but also every available commodity
     * in the game world.
     */
    Trader()
    {
        
        /** Europe */
        traderGoodsList.add(new Goods("Cheese"));
        traderGoodsList.add(new Goods("Fish"));
        traderGoodsList.add(new Goods("Shoes"));
        
        /** Africa */
        traderGoodsList.add(new Goods("Cocoa"));
        traderGoodsList.add(new Goods("Cotton"));
        traderGoodsList.add(new Goods("Gold"));
        
          /** Asia */
        traderGoodsList.add(new Goods("Rice"));
        traderGoodsList.add(new Goods("Rubber"));
        traderGoodsList.add(new Goods("Steel"));
        
           /**Austrailia */
        traderGoodsList.add(new Goods("Aluminium"));
        traderGoodsList.add(new Goods("Coal"));
        traderGoodsList.add(new Goods("Wool"));
        
           /** North America */
        traderGoodsList.add(new Goods("Beef Cattle"));
        traderGoodsList.add(new Goods("Lumber"));
        traderGoodsList.add(new Goods("Wheat"));
        
        /** South America */
        traderGoodsList.add(new Goods("Bananas"));
        traderGoodsList.add(new Goods("Coffee"));
        traderGoodsList.add(new Goods("Crude Oil"));
        
    }
    
}
