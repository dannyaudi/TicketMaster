public class CheckAvailability //not complete yet
{
    public static void CheckAvailability (NewStadium a)  //Check Availability option
    {
	int eventchosen;

	do
	{
	    System.out.println ("Please enter which event you wish to check its availability");
	    System.out.println (" ");
	    System.out.println ("1) Thursday, June 13th");
	    System.out.println ("2) Friday, June 14th");
	    System.out.println ("3) Saturday, June 15th");
	    System.out.println ("Enter 0 to return to the main menu");
	    System.out.println (" ");

	    eventchosen = TextIO.getlnInt ();

	    if (eventchosen == 1)
	    {
		System.out.println ("There are " + a.sumReserved(a) + " seats taken out of 32");
	    }

	    else if (eventchosen == 2)
	    {
		System.out.println ("There is 32 seats available");
	    }

	    else if (eventchosen == 3)
	    {
		System.out.println ("There is 32 seats available");
	    }

	    else if (eventchosen == 0)
	    {
		System.out.println ("Exiting");
	    }

	    else
		System.out.println ("Incorrect. Try again");

	}
	while (eventchosen != 0);
    }
}







