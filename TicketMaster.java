public class TicketMaster
{
    public static void main (String[] args)
    {
	int userchoice;

	System.out.println ("Welcome to the online ticket master");

	do
	{
	    System.out.println ("Please enter which option you wish to use");
	    System.out.println (" ");
	    System.out.println ("1) Purchasing Tickets");
	    System.out.println ("2) Check ticket status");
	    System.out.println ("3) Check Availability");
	    System.out.println ("4) Operator Menu");
	    System.out.println ("5) Exit ticket master");

	    userchoice = TextIO.getlnInt ();

	    if (userchoice == 1)
	    {
		System.out.println ("Purchasing Ticket");

		//here we will select an event

		//temp
		NewStadium a = new NewStadium ();

		Purchase (a);

	    }

	    else if (userchoice == 2)
	    {
		System.out.println ("Check ticket status option"); //Checking the ticket status option goes here
	    }

	    else if (userchoice == 3)
	    {
		System.out.println ("Check availability option"); //Checking the availability option goes here
	    }

	    else if (userchoice == 4)
	    {
		System.out.println ("Operator Menu option"); //The Operators Menu option goes here
	    }

	    else if (userchoice == 5)
		System.out.println("Exiting Ticket Master");

	    else 
		System.out.println ("Invalid number. Please enter again");
	}
	while (userchoice != 5);
    }

    public static void Purchase (NewStadium a)
    {
	int row;  //row of stadium
	int col;  //column of stadium

	System.out.println ("What seat would you like to purchase?");
	System.out.println ();
	a.print (a);
	System.out.println ();
	System.out.println ("Please enter the row and column of your seat.");
	System.out.println ();

	do
	{
	    System.out.print ("Row: ");
	    row = TextIO.getlnInt ();
	    System.out.println ();
	    System.out.print ("Column: ");
	    col = TextIO.getlnInt ();
	    
	    if(row <0 || row > 5 || col < 0 || col > 5)
		System.out.println("Bad input, try again.");
	    else if (checkReserved())
		System.out.println("Seat is unavailable. Try again.");
	}
	while (col < 0 || col > 5 || row < 0 || row > 5);
	
	System.out.println ("Your ticket will cost $" + Price (row, col));

	a.reserveSeat (a, row, col);
    }

    public static double Price (int row, int col) 
    {
	if (row == 0 || row == 5) //row 0 and 5 cost 150
	    return 150;

	else if (row >= 1 && row <= 4)
	{
	    if(col == 0 || col == 5)
		return 150;
	    else if(col >=1 && col <= 4)
		return 300;
	}
	
	return -1;
    }
}
