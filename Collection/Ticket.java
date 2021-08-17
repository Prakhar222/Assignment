package movieTicket;
/*
 * 
 * author 
 * Prakhar Gupta
 */

public class Ticket implements Runnable
{
	public void run()
	{
		// moving ticket to timed waiting state
		try
		{
			Thread.sleep(2000);
		}

		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("State of customer while it called join() method on ticket -"+
				customer.costm.getState());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}	
	}

}
