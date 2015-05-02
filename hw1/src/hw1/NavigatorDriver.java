/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * Patrick Heintz
 * Navigator driver helps a pilot navigate
 * by doing flight calculations through user input
 */
public class NavigatorDriver {
        //Begin constants
        public static final int QUIT = 0;
        public static final int ADDLOC = 1;
        public static final int DISPLAYPATH = 2;
        public static final int MOVETOLOC = 3;
        public static final int DISPLAYBEARING = 4;
        public static final int TOTAL_LOCATIONS = 100;
        //End Constants
    
    public static void main(String args[])
    {
        intro(); //display program info
        Path path = new Path();  //class to hold path data
        ConsoleMenu menu = new ConsoleMenu();
        menu.initializeMenu();
        int choice;
        
        //switch for function calls based off menu
        while(QUIT != (choice = menu.getChoice()))
        {
            switch(choice)
            {
                case ADDLOC:
                    path.addLocation();
                    break;
                case DISPLAYPATH:
                    System.out.print(path.toString());
                    break;
                case MOVETOLOC:
                    path.moveToLocation();
                    break;
                case DISPLAYBEARING:
                    path.displayBearing();
                    break;
            }
        }
    }
    
    /*
        Intro message for starting the program
    */
    static void intro()
    {
        System.out.println("This is a crude navigator for flying a chosen "
        + "path.\n" + "It just stores a sequence of latitudes and "
        + "longitudes of locations\n"+ "and allows the user to "
        + "get bearings from each location to follow the path\n");
    }
}

/*
run:
This is a crude navigator for flying a chosen path.
It just stores a sequence of latitudes and longitudes of locations
and allows the user to get bearings from each location to follow the path

Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
1
Please enter the name of the next location: 
Baghdad
Please enter the latitude of the next location: 
33.33
Please enter the latitude of the next location: 
44.44
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
1
Please enter the name of the next location: 
Spain
Please enter the latitude of the next location: 
11.12
Please enter the latitude of the next location: 
44.44
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
2
Location: Baghdad(33.33, 44.44)
Location: Spain(11.12, 44.44)
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
3
Please enter the name of the location: 
Baghdad
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
4
Head out on a bearing of 180.0 degrees.

Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
4
Head out on a bearing of 180.0 degrees.

Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
1
Please enter the name of the next location: 
Osaka
Please enter the latitude of the next location: 
142.22
Please enter the latitude of the next location: 
17.11
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
2
Location: Baghdad(33.33, 44.44)
Location: Spain(11.12, 44.44)
Location: Osaka(142.22, 17.11)
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
3
Please enter the name of the location: 
Spain
Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
4
Head out on a bearing of 26.22776044070316 degrees.

Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
4
Head out on a bearing of 26.22776044070316 degrees.

Please enter one of the following choices:
0: Quit
1: Add a location to the path
2: Display Path
3: Move to named location
4: Display the initial bearings to take from current location to get to the next on the path
0
BUILD SUCCESSFUL (total time: 1 minute 1 second)
*/