import java.util.ArrayList;

public class TicketMaster
{
    public static void main (String[] args)
    {
	int userchoice;

	System.out.println ("Welcome to the online TicketMaster");

	NewStadium a = new NewStadium ("Concert", "01/01/2000");
	
	ArrayList events = new ArrayList();

	events.add(a);
	
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

		Utils.Purchase (a);

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

		System.out.println ("Transaction Complete. Your confirmation code is " /*CONFIRMATION*/+ ". Returning to main menu.");

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
	    }

	    else if (userchoice == 3)
	    {
		System.out.println ("Check Availability");
		
		for(int i = 0; i < events.size(); i++)
		{
		    System.out.println(events.get(i).printInfo(events.get(i)));
		    // Need to declare Arraylist of only type NewStadium, or change methods
		    //NewStadium temp = events.get(i);
		    //System.out.println(temp.toString() + " | " + temp.sumReserved(temp)); 
		}
	    }

	    else if (userchoice == 4)
	    {
		System.out.println ("Operator Menu"); 
	    }

	    else if (userchoice == 5)
		System.out.println ("Exiting TicketMaster");

	    else
		System.out.println ("Invalid option. Please enter again");
	}
	while (userchoice != 5);
    }


    


}
