/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

import java.util.Random;
import java.util.Scanner;

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
    
    static int tradeAmount = 100;


    /**
     * Takes the user through purchasing a good.  A few menus
     * as well as being able to select which goods they would like to purchase
     * 
     * 
     * 
     * @param player
     * @param other
     * @param newGame 
     */
    static void initiatePurchase(Trader player, Trader other, GameData newGame) 
    {
        int price;
        Scanner inputScanner = new Scanner(System.in);
        String userIn;
        Goods goodToTrade;
        System.out.print(other.region + "Has the following goods for trade: \n\n");
        other.showGoods();
        
        
        System.out.print(("Type the name of good you would like to purchase('b' to go back)(case sensitive): "));
        String tradedGood = inputScanner.next();
        if(tradedGood.equals("b"))
            return;
        else
        {
            goodToTrade = other.findGood(tradedGood);
            if(goodToTrade.name.equals("bad"))
            {
                System.out.println("Commodity not found.");
            }
            else
            {
                price = generateOffer(goodToTrade);
                
                System.out.print("Would you like to purchase 100 "
                        + goodToTrade.units + " of " + goodToTrade.name + " for"
                        + " $" + price +"? (y/n)");
                userIn = inputScanner.next();
                if(userIn.equals("y"))
                {
                    trade(player, other, tradedGood, price, tradeAmount, newGame);
                }
            }
        }
    }

    /**
     * Generate an offer based on the good's price and
     * java's Random function.
     * 
     * @param goodToTrade is used to get the 'value' of the 
     * commodity
     * @return 
     */
    private static int generateOffer(Goods goodToTrade) 
    {
        int bound = 50;
        int offerAmount;
        Random randPaul = new Random();  // xD
        
        int amount = randPaul.nextInt(bound);
        int addOrSubtract = randPaul.nextInt(1);
        
        if(addOrSubtract == 0)
        {
            offerAmount = goodToTrade.marketValue - amount;
        }
        else
        {
            offerAmount = goodToTrade.marketValue + amount;
        }
        return offerAmount;
    }

    /**
     * Used to start a sale
     * 
     * @param newGame uses the current game data for the sale
     */
    static void initiateSale(GameData newGame) {
        int price;
        String userIn;
        Goods goodToTrade;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("You have the following goods for sale: \n\n");
        newGame.player.showGoods();
        
        System.out.print(("Type the name of good you would like to sell('b' to go back)(case sensitive): "));
        String tradedGood = inputScanner.next();
        
        if(tradedGood.equals("b"))
            return;
        else
            {
                goodToTrade = newGame.player.findGood(tradedGood);
                Trader leader = getRandomLeader(newGame);
                price = generateOffer(goodToTrade);
                
                System.out.print("Would you like to sell 100 "
                        + goodToTrade.units + " of " + goodToTrade.name + " to " + leader.region + " for"
                        + " $" + price +"? (y/n)");
                userIn = inputScanner.next();
                if(userIn.equals("y"))
                {
                    trade(leader, newGame.player, tradedGood, price, tradeAmount, newGame);
                }
            }
                
       
    }

    /**
     * Picks a random leader that will buy the goods the user
     * is trying to sell
     * 
     * @param newGame
     * @return 
     */
    private static Trader getRandomLeader(GameData newGame) 
    {
        Random randy = new Random();
        int selection = randy.nextInt(4);
        switch(selection)
        {
            case 0:
                return newGame.africa;
            case 1:
                return newGame.asia;
            case 2:
                return newGame.austrailia;
            case 3:
                return newGame.northAmerica;
            case 4:
                return newGame.southAmerica;
        }
        return null;
    }
    
    int offer(Trader otherTrader)
    {
        int price = 0;
        return price;
    }
    
    /**
     * Simple swap function with money and commodities
     * 
     * @param buyer is the trader purchasing
     * @param seller is the trader selling
     * @param good, the name of the product
     * @param price, amount agreed to be paid
     * @param amount, Quantity
     */
    static void trade(Trader buyer, Trader seller, String good, int price, int amount, GameData playerInfo)
    {
        if(buyer.money < price)
        {
            System.out.print(buyer.name + " doesn't have enough money!");
            return;
        }
        if(seller.money < price)
        {
            System.out.print(seller.name + " doesn't have enough money!");
            return;
        }
        buyer.money -= price;
        seller.money += price;
        buyer.addAmount(good, amount);
        seller.subtractAmount(good, amount);
    }
    
    
}
