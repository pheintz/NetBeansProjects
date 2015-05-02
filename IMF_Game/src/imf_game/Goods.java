/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

/**
 *
 * @author Patrick Heintz
 * Goods which will be 'owned' by the trader class.
 * trader will have a list of goods
 */
public class Goods {
    
    /** Name of good */
    String name;
    
    /** Quantity of good */
    int amount;
    
    Goods(String n)
    {
        name = n;
        amount = 0;
    }
    
}
