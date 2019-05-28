// The "Ticket" class.
public class Ticket
{
	private int seatNumber;
	private int date;
	private int price;
	
	public Ticket (int s, int d, int p)
	{
	    seatNumber = s;
	    date = d;
	    price = p;
	}
	
	public int getSeatNumber ()
	{
	    return seatNumber;
	}
	
	public int getDate ()
	{
	    return date;
	}
	
	public int getprice ()
	{
	    return price;
	}
     
} 
