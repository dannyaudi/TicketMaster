public class NewStadium
{
    private String[] [] stadium;
    private String name;
    private String date;

    public NewStadium (String n, String d)
    {
	name = n;
	date = d;
	
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

	System.out.println("    0 1 2 3 4 5");
	System.out.println("   ------------");
	
	for (int i = 0 ; i < s.length ; i++)
	{
	    System.out.print(i + " | ");
	    for (int j = 0 ; j < s [0].length ; j++)
	    {
		System.out.print (s [i] [j] + " ");
	    }
	    System.out.println ();            
	}
    }
    
    public String printInfo(NewStadium a)
    {
	return a.getName() + " | " + a.getDate(); 
    }

    public String[] [] getStadium ()
    {
	return stadium;
    }
    
    public String getName()
    {
	return name;
    }
    
    public String getDate()
    {
	return date;
    }

    public int sumReserved (NewStadium a)
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
    
    public String[][] reserveSeat(NewStadium a, int row, int col)
    {
	String[] [] s = a.getStadium ();
    
	s[row][col] = "R";
	
	return s;
    }
    
    public boolean checkReserved(NewStadium a, int row, int col)
    {
	String[] [] s = a.getStadium ();
	
	if(s[row][col] == "R" || s[row][col] == "X")
	    return true;
	else
	    return false;
    }
}
