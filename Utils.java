import java.util.ArrayList;
import java.text.*;
import java.io.*;

// This class contains various utility methods pertaining to ticket purchasing, the operator menu, and event selection
public class Utils
{
    // This method is used to select a seat in ticket purchasing
    // Newstadium a is the stadium for which the ticket is being purchased
    // ArrayList c is the list of confirmed tickets purchased each containing a String of info
    public static void Purchase (NewStadium a, ArrayList c)
    {
	// Used for rounding the price received by the Price method
	NumberFormat nf = NumberFormat.getInstance ();
	nf.setMaximumFractionDigits (2);
	nf.setMinimumFractionDigits (2);

	int row, col;

	System.out.println ("What seat would you like to purchase?\n");
	a.print (a);    // Prints out a map of the stadium
	System.out.println ("\nPlease enter the row and column of your seat.\n");
	
	// Loops until the input is valid
	do
	{
	    System.out.print ("Row: ");
	    row = TextIO.getlnInt ();
	    System.out.print ("Column: ");
	    col = TextIO.getlnInt ();
	    
	    // Error handling, check if seat exists and is available
	    if (row < 0 || row > 5 || col < 0 || col > 5)
		System.out.println ("Bad input, try again.");
	    else if (a.checkReserved (a, row, col))
		System.out.println ("Seat is unavailable. Try again.");
	}
	while (col < 0 || col > 5 || row < 0 || row > 5);

	System.out.println ("Your ticket will cost $" + nf.format (Price (a, row, col)));

	a.reserveSeat (a, row, col);    // Rewriting the position of the new seat as reserved

	c.add (a.getName () + " on " + a.getDate () + ", row " + row + ", column " + col);  // Adding this ticket to the list of confirmed purchases
    }


    // This method determines the price of the seat being purchased
    // Outer seats have a base price of $150 and inner are $300
    // Prices are increased by a factor dependant on the percentage of seats taken
    public static double Price (NewStadium a, int row, int col)
    {
	if (row == 0 || row == 5)
	    return 150 * ((a.sumReserved (a) / 32.0) + 1);

	else if (row >= 1 && row <= 4)
	{
	    if (col == 0 || col == 5)
		return 150 * ((a.sumReserved (a) / 32.0) + 1);
	    else if (col >= 1 && col <= 4)
		return 300 * ((a.sumReserved (a) / 32.0) + 1);
	}

	return -1;
    }


    /* This method will not work in old versions of Java
    // Prints a list of all events currently saved, and grabs input from the user
    // Returns the NewStadium event selected by the user
    public static void SelectEvent(ArrayList e)
    {
	System.out.println("Please select an event");

	for(int i = 0; i < e.size(); i++)
	    System.out.println(i + ") " + e.get(i).printInfo(e.get(i)));

	int choice = TextIO.getlnInt();

	while(choice < 0 || choice >= e.size())
	{
	    System.out.println("Bad input. Try again");
	    choice = TextIO.getlnInt();
	}

	return e.get(choice);
    }
    */

    // This method is called at the start of the program
    // It keeps track of the number of times the program has been launched through a log file
    public static void LogIncrease () throws IOException
    {
	// The permanent name of the log file is "log.txt"
	final String logName = "log.txt";

	if (new File (logName).exists ())   // If the program has been launched before
	{
	    BufferedReader in = new BufferedReader (new FileReader (logName));

	    // Reads the log for the number of launches, and increments by one and creates a String            
	    String temp = Integer.toString((Integer.parseInt (in.readLine ())) + 1);  

	    BufferedWriter out = new BufferedWriter (new FileWriter (new File (logName)));

	    out.write (temp);
	    
	    out.flush();
	    out.close();
	}
	else    // If the log file does not exist, create it and log this first launch
	{
	    BufferedWriter out = new BufferedWriter (new FileWriter (new File (logName)));
	    out.write ("1");
	    
	    out.flush();
	    out.close();
	}

    }
}
