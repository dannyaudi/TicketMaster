import java.util.ArrayList;

public class TicketMaster
{
    public static void main (String[] args)
    {
	System.out.println ("Welcome to the online TicketMaster");

	// temporary
	NewStadium a = new NewStadium ("Concert", "01/01/2000");

	// list of NewStadiums, contains all the events created
	ArrayList events = new ArrayList ();
	
	// temporary
	events.add (a);

	// List of strings containing info on tickets, according to their confirmation number
	// example, index 0 is for confirmation number 1001
	ArrayList confirmation = new ArrayList ();  
    
	// this field is used in the numbering of confirmation numbers and is incremented as tickets are purchased
	int codeNumber = 1000;

	int userchoice;
	do
	{
	    System.out.println ("\nPlease enter which option you wish to use\n");
	    System.out.println ("1) Purchase Ticket");
	    System.out.println ("2) Check Ticket Status");
	    System.out.println ("3) Check Availability");
	    System.out.println ("4) Operator Menu");
	    System.out.println ("5) Exit TicketMaster");

	    userchoice = TextIO.getlnInt ();

	    if (userchoice == 1)
	    {
		System.out.println ("Purchasing Ticket");

		// here we will select an event

		Utils.Purchase (a, confirmation);

		System.out.println ("Forwarding to process your payment");
		System.out.println ("...");

		try     // simulating payment processing
		{
		    Thread.sleep (1000);
		    System.out.println ("...");
		    Thread.sleep (1000);
		    System.out.println ("...");
		    Thread.sleep (1000);
		}
		catch (InterruptedException ex)
		{
		    Thread.currentThread ().interrupt ();
		}
	       
		codeNumber++;
		System.out.println ("Transaction Complete. Your confirmation code is " + codeNumber + ". Returning to main menu.");

		try
		{
		    Thread.sleep (2000);
		}
		catch (InterruptedException ex)
		{
		    Thread.currentThread ().interrupt ();
		}
	    }

	    else if (userchoice == 2)
	    {
		System.out.println ("Check Ticket Status");
		System.out.print ("\nPlease enter your confirmation code: ");
		
		int codeInput = TextIO.getlnInt ();
		
		while (codeInput <= 1000 || codeInput - 1001 >= confirmation.size() || codeInput < 0)
		{        
		    //System.out.println("TEST2   " + (codeInput - 1001) + "    " + (codeInput - 1001 >= confirmation.size ()));
		    if (codeInput < 1000 || codeInput - 1001 >= confirmation.size () || codeInput - 1001 < 0)
			System.out.println ("That confirmation code does not exist. Please try again or enter 0 to exit.");
		    
		    codeInput = TextIO.getlnInt ();
		    
		    if(codeInput == 0)
			break;                        
		}                 
		
		if(codeInput == 0)
		    System.out.println("Returning to main menu.");
		else
		    System.out.println ("Your ticket is for: " + confirmation.get (codeNumber - 1001));
	    }

	    else if (userchoice == 3)
	    {
		System.out.println ("Check Availability");

		for (int i = 0 ; i < events.size () ; i++)
		{
		    // Need to declare Arraylist of only type NewStadium, or change method parameters
		    //System.out.println(events.get(i).printInfo(events.get(i)));
		    //NewStadium temp = events.get(i);
		    //System.out.println(temp.toString() + " | " + temp.sumReserved(temp));
		}
	    }

	    else if (userchoice == 4)
	    {
		System.out.println ("Operator Menu");
		
		System.out.println("Enter the option you wish to use\n");
		System.out.println("1) Create new event");
		System.out.println("2) Rename an event");
		System.out.println("3) Change the date of an event");
		System.out.println("4) Delete an event");
		System.out.println("5) Check log details");
		System.out.println("Enter 0 to exit");
	    }

	    else if (userchoice == 5)
		System.out.println ("Exiting TicketMaster");

	    else
		System.out.println ("Invalid option. Please enter again");
	}
	while (userchoice != 5);
    }





}
