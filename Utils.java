import java.util.ArrayList;

public class Utils
{
    public static void Purchase (NewStadium a, ArrayList c)
    {
	int row, col;

	System.out.println ("What seat would you like to purchase?\n");
	a.print (a);
	System.out.println ("\nPlease enter the row and column of your seat.\n");

	do
	{
	    System.out.print ("Row: ");
	    row = TextIO.getlnInt ();
	    System.out.print ("Column: ");
	    col = TextIO.getlnInt ();

	    if (row < 0 || row > 5 || col < 0 || col > 5)
		System.out.println ("Bad input, try again.");
	    else if (a.checkReserved (a, row, col))
		System.out.println ("Seat is unavailable. Try again.");
	}
	while (col < 0 || col > 5 || row < 0 || row > 5);

	System.out.println ("Your ticket will cost $" + Price (row, col));

	a.reserveSeat (a, row, col);
	
	c.add(a.getName() + " on " + a.getDate() + ", row " + row + ", column " + col);
    }
    
    // this method determines the price of the seat being purchased
    // outer seats have a base price of $150 and inner are $300
    public static double Price (int row, int col)
    {
	if (row == 0 || row == 5)
	    return 150;

	else if (row >= 1 && row <= 4)
	{
	    if (col == 0 || col == 5)
		return 150;
	    else if (col >= 1 && col <= 4)
		return 300;
	}

	return -1;
    }
    
    /* This method will not work in old versions of Java
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
}
