import java.util.ArrayList;
import java.io.*;

public class TicketMaster
{
    public static void main (String[] args) throws IOException
    {
	// Logging that program has been launched
	Utils.LogIncrease();    
    
	System.out.println ("Welcome to the online TicketMaster");
	System.out.println ("A default event has been created for you, to customize or add new events, enter the operator menu.");
	// Generating default event
	NewStadium a = new NewStadium ("Concert", "01/01/2000");

	// list of NewStadiums, contains all the events created
	ArrayList<NewStadium> events = new ArrayList<> ();
	
	// Adding default event to the list of events
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
	    System.out.println ("Enter 0 to exit TicketMaster");

	    userchoice = TextIO.getlnInt ();

	    if (userchoice == 1)
	    {
			System.out.println ("Purchasing Ticket\n");

			// Selecting an event
			NewStadium temp = Utils.SelectEvent(events);
			
			// Replace temp with a if running on old java
			Utils.Purchase (temp, confirmation);

			System.out.println ("Forwarding to process your payment");
			System.out.println ("...");

			try     // Simulating payment processing
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
			
			codeNumber++;   // Incrementing the confirmation code and giving it to the user
			System.out.println ("Transaction Complete. Your confirmation code is " + codeNumber + ". Returning to main menu.");

			try     // Simple timer to allow reading
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
			
			// Checking if input is valid, if number does not exist then asks again
			while (codeInput <= 1000 || codeInput - 1001 >= confirmation.size() || codeInput < 0)
			{ 
				if (codeInput < 1000 || codeInput - 1001 >= confirmation.size () || codeInput - 1001 < 0)
				System.out.println ("That confirmation code does not exist. Please try again or enter 0 to exit.");
				
				codeInput = TextIO.getlnInt ();
				
				if(codeInput == 0)
				break;                        
		}                 
		
		if(codeInput == 0)
		    System.out.println("Returning to main menu.");
		    
		else    // Prints the info of that ticket, calculates index by reducing the confirmation code by 1001
		    System.out.println ("Your ticket is for: " + confirmation.get (codeNumber - 1001));
	    }

	    else if (userchoice == 3)
	    {
			System.out.println ("Check Availability\n");
			
			// Selecting an event and printing the stadium and number of seats taken
			NewStadium temp = Utils.SelectEvent(events);           
			temp.print(temp);
			System.out.println("There are " + temp.sumReserved(temp) + " seats taken out of 32");
	    }

	    else if (userchoice == 4)
	    {
			System.out.println ("Operator Menu");
			
			OperatorMenu.OperatorMenuOption(events);                    
	    }

	    else if (userchoice == 0)
			System.out.println ("Exiting TicketMaster");

	    else
			System.out.println ("Invalid option. Please enter again");
	}
	while (userchoice != 0);
    }





}
