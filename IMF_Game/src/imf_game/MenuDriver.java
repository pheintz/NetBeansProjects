/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

import java.util.Scanner;

/**
 *
 * @author Lloyd
 */
public class MenuDriver {
    
    Scanner inputScanner;
    
    String intro;
    String select;
    String selected;
    String askTrade;
    
    String tradeOptionOne = "1";
    String tradeOptionTwo = "2";
    String tradeOptionThree = "3";
    
    MenuDriver()
    {
        inputScanner = new Scanner(System.in);
        
        intro = "Welcome to the IMF trading game.  You will start with money to "
            + "buy goods and commodities (things to sell) from one of the "
            + "continents. As you play, you will discover that there is another "
            + "commodity that you can't buy because of trade barriers. "
            + "Without the IMF, these types of problems would be much more common "
            + "and international trade would be far more limited.\n\n";
    
    
        selected = "You can purchase the following goods\n";
    }
    
    String getLeader(GameData myGame)
    {
        System.out.print(myGame.africa.name);
        
        String selected = inputScanner.next("Type the country of a trader "
                + "you would like to trade with(case sensitive): ");
        
        return selected;
    }
    
    void tradeWithLeader(Trader selected)
    {
        // "leader has the following available for trade)
        // print list
        // give action options
        
    }
    
}
