import java.util.ArrayList;
import java.io.*;

public class OperatorMenu
{
    public static void OperatorMenuOption (ArrayList events) throws IOException
    {
	int operatorChoice;
	String newEventName;
	String newEventDate;
	String renameEvent;
	String changeDate;

	do
	{
	    System.out.println ("\nEnter the option you wish to use\n"); //will ask user which option they wish to use
	    System.out.println ("1) Create new event");
	    System.out.println ("2) Rename an event");
	    System.out.println ("3) Change the date of an event");
	    System.out.println ("4) Delete an event");
	    System.out.println ("5) Check log details");
	    System.out.println ("Enter 0 to exit");

	    operatorChoice = TextIO.getlnInt ();

	    if (operatorChoice == 1)
	    {
		System.out.println ("\nCreating a new event\n");
		System.out.println ("Enter the name of the new event you wish to create");
		newEventName = TextIO.getlnString ();
		System.out.println ("\nEnter the date of when you wish the new event to take place\n");
		System.out.println ("Format the date as the following: 01/01/2000");
		newEventDate = TextIO.getlnString ();
		NewStadium newEvent = new NewStadium (newEventName, newEventDate);
		events.add (newEvent);
	    }

	    else if (operatorChoice == 2)
	    {
		System.out.println ("\nRenaming an event\n");
		//NewStadium rename = SelectEvent(events);
		System.out.println ("What do you wish the new name to be?");
		//renameEvent = TextIO.getlnString ();
		//rename.setName(renameEvent);
		
	    }

	    else if (operatorChoice == 3)
	    {
		System.out.println ("\nChanging the date of an event\n");
		System.out.println ("Select the event you wish to change the date of");
		//NewStadium changedate = SelectEvent(events);
		System.out.println ("\nEnter the new date of the event");
		System.out.println ("Format the date as the following: 01/01/2000");
		changeDate = TextIO.getlnString ();
		//changedate.setDate(changeDate); 
	    }
	    else if (operatorChoice == 4) //Deleting an event
	    {
		System.out.println("\nDeleting an event\n");    
		System.out.println("Select the event you wish to delete");
		//NewStadium delete = SelectEvent(events)
		
		//System.out.println("Event " + delete.printInfo(delete) + " has been deleted."); 
		
		//events.delete(delete);            
	    }
	    else if (operatorChoice == 5)
	    {
		System.out.println("\nChecking log details\n");
		
		final String logName = "log.txt";
		
		if(new File(logName).exists())
		{   
		    BufferedReader in = new BufferedReader(new FileReader(logName));
		    
		    String launches = in.readLine();
		    
		    System.out.println("I have read " + launches);
		    
		    if(Integer.parseInt (launches) == 1)
			System.out.println("Program has been launched " + launches + " time.");
		    else
			System.out.println("Program has been launched " + launches + " times.");

		}
		else
		    System.out.println("Program has never been launched yet, or log.txt name has been changed/edited.");
	    }
	    else if (operatorChoice == 0)
		continue;
	    else
		System.out.println("Bad input, try again.");
	}
	while (operatorChoice != 0);
    }
}

