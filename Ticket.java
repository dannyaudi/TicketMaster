// The "Ticket" class.
public class Ticket
{
	private int seatNumber;
	private int date;
	private int typeOfTicket;
	private int price;
	
	public Ticket (int s, int d, int p, String t)
	{
	    seatNumber = s;
	    date = d;
	    typeOfTicket = t;
	    price = typeCalc(typeOfTicket, p);
	}
	
	public int getSeatNumber ()
	{
	    return seatNumber;
	}
	
	public int getDate ()
	{
	    return date;
	}
	
	public int typeCalc ()
	{
	     if (typeOfTicket = "Silver");
		return p + 100;
	     
	     if (typeOfTicket = "Gold");
		return p + 200;
		
	     if (typeOfTicket = "Platinum");
		return p + 300;
	}

	public int getprice ()
	{
	    return price;
	}
     
} 
