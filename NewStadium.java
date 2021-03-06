// The NewStadium object is used to create events within TicketMaster
// Each NewStadium is comprised of a seating map, event name, and event date

public class NewStadium
{
    private String[] [] stadium;
    private String name;
    private String date;

    public NewStadium (String n, String d)
    {
	name = n;
	date = d;

	stadium = new String[] []
	{
	    {"0", "0", "0", "0", "0", "0"},
	    {"0", "0", "0", "0", "0", "0"},
	    {"0", "0", "X", "X", "0", "0"},
	    {"0", "0", "X", "X", "0", "0"},
	    {"0", "0", "0", "0", "0", "0"},
	    {"0", "0", "0", "0", "0", "0"},
	};
    }

    // Prints the stadium map with rows and columns labelled
    public void print (NewStadium a)
    {
	String[] [] s = a.getStadium ();

	System.out.println ("    0 1 2 3 4 5");
	System.out.println ("   ------------");

	for (int i = 0 ; i < s.length ; i++)
	{
	    System.out.print (i + " | ");
	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		System.out.print (s [i] [j] + " ");
	    }
	    System.out.println ();
	}
    }


    // Returns the name and date of the event formatted neatly
    public String printInfo (NewStadium a)
    {
	return a.getName () + " on " + a.getDate ();
    }

    // returns the stadium as an array of Strings
    public String[] [] getStadium ()
    {
	return stadium;
    }

    // Returns the name of an event as a String
    public String getName ()
    {
	return name;
    }

    // Returns the date of an event as a String
    public String getDate ()
    {
	return date;
    }

    // Sets a new name for an event
    public void setName (String n)
    {
	name = n;
    }

    // Sets a new date for an event
    public void setDate (String d)
    {
	date = d;
    }


    // Returns the number of seats reserved in a stadium
    public int sumReserved (NewStadium a)
    {
	String[] [] s = a.getStadium ();

	int counter = 0;

	for (int i = 0 ; i < s.length ; i++)
	{
	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		if (s [i] [j] == "R")   // Counts each seat with a reserved value of "R"
		    counter++;
	    }
	}
	return counter;
    }


    // Reserves a seat by rewriting spot as "R"
    public String[] [] reserveSeat (NewStadium a, int row, int col)
    {
	String[] [] s = a.getStadium ();

	s [row] [col] = "R";

	return s;
    }


    // Checks if a seat is available to purchase, i.e. is not "R" or "X"
    public boolean checkReserved (NewStadium a, int row, int col)
    {
	String[] [] s = a.getStadium ();

	if (s [row] [col] == "R" || s [row] [col] == "X")
	    return true;
	else
	    return false;
    }
}
