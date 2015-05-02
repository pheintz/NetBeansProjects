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
    Trader europe;
    Trader africa;
    Trader asia;
    Trader austrailia;
    Trader northAmerica;
    Trader southAmerica;

    /** market prices */
    int cheese = 250;
    int fish = 1000;
    int shoes = 400;
    int cocoa = 100;
    int cotton = 400;
    int gold = 250;
    int rice = 300;
    int rubber = 500;
    int steel = 450;
    int aluminium = 500;
    int coal = 250;
    int wool = 200;
    int beef = 545;
    int lumber = 200;
    int wheat = 125;
    int bananas = 225;
    int coffee = 350;
    int oil = 500;
    
    GameData()
    {
        europe = new Trader("Sophie", "Europe", 9000);
        europe.addAmount("Cheese", 1000);
        europe.addAmount("Fish", 2500);
        europe.addAmount("Shoes", 200);
        
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
