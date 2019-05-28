public class NewStadium
{

    private String[] [] stadium;

    public NewStadium ()
    {

	stadium = {
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

	    System.out.println ();

	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		System.out.print (s [i] [j]);
	    }
	}
    }

    public String[] [] getStadium ()
    {
	return stadium;
    }
}
