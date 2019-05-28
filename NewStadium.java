public class NewStadium
{
    private String[] [] stadium;

    public NewStadium ()
    {
	stadium = new String[][]{
		{"0", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "0", "0"},
		{"0", "0", "X", "X", "0", "0"},
		{"0", "0", "X", "X", "0", "0"},
		{"0", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "0", "0"},
	    };
    }

    public void print (NewStadium a)
    {

	String[] [] s = a.getStadium ();

	for (int i = 0 ; i < s.length ; i++)
	{
	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		System.out.print (s [i] [j] + " ");
	    }
	    
	    System.out.println ();
	}
    }

    public String[] [] getStadium ()
    {
	return stadium;
    }

    public int checkReserved (NewStadium a)
    {
	String[] [] s = a.getStadium ();

	int counter = 0;

	for (int i = 0 ; i < s.length ; i++)
	{
	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		if (s [i] [j] == "R")
		    counter++;
	    }
	}
	return counter;
    }
}
