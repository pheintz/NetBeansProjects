/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imf_game;

/**
 *
 * @author Lloyd
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    static final int quit = 0;
    static final int africa = 1;
    static final int northAmerica = 2;
    static final int southAmerica = 3;
    static final int asia = 4;
    static final int austrailia = 5;
    
    static final int buy = 1;
    static final int sell = 2;
    static final int viewInfo = 3;
    
    public static void main(String[] args) 
    {
        int selected = -1;
        
        /** Init new game */
        GameData newGame = new GameData();
        
        /** Display Menu, Ask user who they want to trade with */
        MenuDriver gameMenu = new MenuDriver();
        while(selected != 0)
        {
            if(newGame.player.money < 250)
            {
                System.out.print("\nOut of money!");
                System.exit(quit);
            }
            selected = gameMenu.mainPrompt();
            switch(selected)
            {
                case buy:
                    selected = gameMenu.getLeader(newGame);
                    switch(selected)
                    {
                        case africa:
                            TradeManager.initiatePurchase(newGame.player, newGame.africa, newGame);
                            break;
                        case northAmerica:
                            TradeManager.initiatePurchase(newGame.player, newGame.northAmerica, newGame);
                            break;
                        case southAmerica:
                            TradeManager.initiatePurchase(newGame.player, newGame.southAmerica, newGame);
                            break;
                        case asia:
                            TradeManager.initiatePurchase(newGame.player, newGame.asia, newGame);
                            break;
                        case austrailia:
                            TradeManager.initiatePurchase(newGame.player, newGame.austrailia, newGame);
                            break;
                        default:
                            selected = gameMenu.getLeader(newGame); 
                            break;
                    }
                    break;
                case sell:
                    TradeManager.initiateSale(newGame);
                    break;
                case viewInfo:
                    System.out.println("Name:\t" + newGame.player.name);
                    System.out.println("Region:\t" + newGame.player.region);
                    System.out.println("Money:\t$" + newGame.player.money);
                    newGame.player.showGoods();
                    break;
            }
        }
    }
}
    

