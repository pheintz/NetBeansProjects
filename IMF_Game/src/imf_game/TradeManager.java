/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

/**
 *
 * @author Lloyd
 * Acts as a buffer between the player and other traders
 * for transactions such as trades, offers, swapping of goods and money
 */

/**
 * Trade between merchants
 * Generate prices
 * 
 */
public class TradeManager {
    
    int offer(Trader otherTrader)
    {
        int price = 0;
        return price;
    }
    
    /**
     * 
     * @param buyer is the trader purchasing
     * @param seller is the trader selling
     * @param good, the name of the product
     * @param price, amount agreed to be paid
     * @param amount, Quantity
     */
    
    void trade(Trader buyer, Trader seller, String good, int price, int amount)
    {
        buyer.money -= price;
        seller.money += price;
        buyer.addAmount(good, amount);
        seller.subtractAmount(good, amount);
    }
    
    
}
