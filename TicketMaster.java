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
		System.out.println ("purchasing tickets option"); //purchasing ticket option goes here
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
	    {
		System.out.println("Exiting ticket master");
	    }

	    else 
	    {
		System.out.println ("Invalid number. Please enter again");
	    }

	}
	while (userchoice != 5);
	
	//end of program
	
    }
}  
