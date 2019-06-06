import java.util.ArrayList;

public class OperatorMenu //incomplete so far
{
    public static void OperatorMenuOption (ArrayList events)  //The Operators Menu option
    {
	int operatorchoice;
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

	    operatorchoice = TextIO.getlnInt ();

	    if (operatorchoice == 1)  //Creating a new event option
	    {
		System.out.println ("\nCreating a new event option\n");
		System.out.println ("Enter the name of the new event you wish to create");
		newEventName = TextIO.getlnString ();
		System.out.println ("\nEnter the date of when you wish the new event to take place\n");
		System.out.println ("Format the date as the following: 01/01/2000");
		newEventDate = TextIO.getlnString ();
		NewStadium newEvent = new NewStadium (newEventName, newEventDate);
		events.add (newEvent);
	    }

	    else if (operatorchoice == 2) //Renaming an event option
	    {
		System.out.println ("\nRenaming an event option\n");
		//NewStadium rename = SelectEvent(events);
		System.out.println ("What do you wish the new name to be?");
		renameEvent = TextIO.getlnString ();
		rename.setName(renameEvent);
		
	    }

	    else if (operatorchoice == 3) //Changing the date of an event option
	    {
		System.out.println ("\nChanging the date of an event option\n");
		System.out.println ("Select the event you wish to change the date of");
		//NewStadium changedate = SelectEvent(events);
		System.out.println ("\nEnter the new date of the event");
		System.out.println ("Format the date as the following: 01/01/2000");
		changeDate = TextIO.getlnString ();
		changedate.setDate(changeDate); 
	    }
	    else if (operatorchoice == 4) //Deleting an event option
	    {
		System.out.println("\nDeleting an event option\n");    
		System.out.println("Select the event you wish to delete");
	    
	    
	    }
	}
	while (operatorchoice != 0);
    }
}

