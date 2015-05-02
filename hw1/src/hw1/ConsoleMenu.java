/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.util.*;

/**
 *
 * @author Patrick Heintz
 */
public class ConsoleMenu {
    
    List<String> menuList = new ArrayList<>();
    
    /**
     * initializeMenu
     * Parameters: None
     * Returns: ConsoleMenu object
     * Description: Loads the class variable menuList
     * with menu values and const values from navigatorDriver
    */
   ConsoleMenu initializeMenu()
   {
       menuList.add("Please enter one of the following choices:\n");
       menuList.add(Integer.toString(NavigatorDriver.QUIT));
       menuList.add(": Quit\n");
       
       menuList.add(Integer.toString(NavigatorDriver.ADDLOC));
       menuList.add(": Add a location to the path\n");
       
       menuList.add(Integer.toString(NavigatorDriver.DISPLAYPATH));
       menuList.add(": Display Path\n");
       
       menuList.add(Integer.toString(NavigatorDriver.MOVETOLOC));
       menuList.add(": Move to named location\n");
       
       menuList.add(Integer.toString(NavigatorDriver.DISPLAYBEARING));
       menuList.add(": Display the "
                + "initial bearings to take from current "
                + "location to get to the next on the path\n");
       return this;
   }
   
    /*
    getChoice
    Parameters: None
    Returns: Int
    
    Displays a simple menu and returns the user input(their choice)
    that corresponds to a menu item.
    */
    int getChoice()
    {
        Scanner stdin = new Scanner(System.in);
        Iterator<String> mover = menuList.iterator();
        while (mover.hasNext())
        {
            String menuString = mover.next();
            System.out.print(menuString);
        }
        
        return stdin.nextInt();
    }
}
