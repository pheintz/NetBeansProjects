/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

/** Store global(in terms of the game map global) conditions such as
 *  Market price of a certain good
 * 
 * Hold list of all of the traders in the game
 */
public class GameData {
    
    /** trading regions */
    Trader player;
    Trader africa;
    Trader asia;
    Trader austrailia;
    Trader northAmerica;
    Trader southAmerica;

    /** market prices */
    static final int cheese = 250;
    static final int fish = 1000;
    static final int shoes = 400;
    static final int cocoa = 100;
    static final int cotton = 400;
    static final int gold = 250;
    static final int rice = 300;
    static final int rubber = 500;
    static final int steel = 450;
    static final int aluminium = 500;
    static final int coal = 250;
    static final int wool = 200;
    static final int beef = 545;
    static final int lumber = 200;
    static final int wheat = 125;
    static final int bananas = 225;
    static final int coffee = 350;
    static final int oil = 500;
    
    
    /**
     * Populate game data
     */
    GameData()
    {
        player = new Trader("Sophie", "Europe", 9000);
        player.addAmount("Cheese", 1000);
        player.addAmount("Fish", 2500);
        player.addAmount("Shoes", 200);
        
        africa = new Trader("Neema", "Africa", 9000);
        africa.addAmount("Cotton", 1500);
        africa.addAmount("Cocoa", 1000);
        africa.addAmount("Gold", 500);
        
        asia = new Trader("Asia", "Noriko", 9000);
        asia.addAmount("Rice", 1500);
        asia.addAmount("Rubber", 1000);
        asia.addAmount("Steel", 500);
        
        austrailia = new Trader("Austrailia", "Donald", 9000);
        austrailia.addAmount("Aluminium", 1500);
        austrailia.addAmount("Coal", 1000);
        austrailia.addAmount("Wool", 500);
        
        northAmerica = new Trader("Anothony", "North America", 9000);
        northAmerica.addAmount("Beef", 1500);
        northAmerica.addAmount("Lumber", 1000);
        northAmerica.addAmount("Wheat", 500);
        
        southAmerica = new Trader("Guillermo", "South America", 9000);
        southAmerica.addAmount("Bananas", 1500);
        southAmerica.addAmount("Coffee", 1000);
        southAmerica.addAmount("Oil", 500);
    }
}
