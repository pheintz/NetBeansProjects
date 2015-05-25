/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

import java.util.Scanner;

/**
 *
 * @author Patrick Heintz
 * Menu 
 * Return values go back to main which directs to
 * associated functions.
 */
public class MenuDriver {
    
    Scanner inputScanner;
    
    String intro;
    String select;
    int selected;
    String askTrade;
        
    /**
     * Start game menu
     */
    MenuDriver()
    {
        inputScanner = new Scanner(System.in);
        
        System.out.print("Welcome to the IMF trading game.  You will start with money to "
            + "buy goods and commodities (things to sell) from one of the "
            + "continents. As you play, you will discover that there is another "
            + "commodity that you can't buy because of trade barriers. "
            + "Without the IMF, these types of problems would be much more common "
            + "and international trade would be far more limited.\n\n");
    }
    
    /**
     * Uses game data to generate world leader information
     * and then provides menu options.
     * 
     * @param myGame
     * @return int associated with menu choice
     */
    int getLeader(GameData myGame)
    {
        System.out.print("1) " + myGame.africa.name +", "+ myGame.africa.region + "\n");
        System.out.print("2) " + myGame.northAmerica.name +", "+ myGame.northAmerica.region + "\n");
        System.out.print("3) " + myGame.southAmerica.name +", "+ myGame.southAmerica.region + "\n");
        System.out.print("4) " + myGame.asia.name +", "+ myGame.asia.region + "\n");
        System.out.print("5) " + myGame.austrailia.name +", "+ myGame.austrailia.region + "\n");
        
        System.out.print("Type the number of a trader "
                + "you would like to trade with: ");
        selected = inputScanner.nextInt();
        return selected;
    }
    /**
     * Base Menu for buy / sell / trade
     * @return user's choice
     */
    int mainPrompt()
    {
        System.out.println("Would you like to\n\t0) Quit. \n\t1) Buy \n\t2) Sell "
                + "\n\t3) View My Info \n\n\t");
        selected = inputScanner.nextInt();
        return selected;
    }
    
}
