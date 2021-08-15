package movieTicket;


public class customer implements Runnable
{
	public static Thread costm;
	public static customer c;
	public static void main(String[] args)
	{
		c = new customer();
		costm = new Thread(c);

		// thread1 created and is currently in the NEW state.
		//System.out.println("State of ticket " + costm.getState());
		costm.start();

		// thread1 moved to Runnable state
		System.out.println("State of customer after calling .start() method  - " + costm.getState());
	}

	public void run()
	{
		Ticket t = new Ticket();
		Thread tick = new Thread(t);

		// thread1 created and is currently in the NEW state.
		//	System.out.println("State of thread2 after creating it - "+ tick.getState());
		tick.start();

		System.out.println("State of ticket after calling " +tick.getState());

		// moving costm to timed waiting state
		try
		{
			//moving costm to timed waiting state
			Thread.sleep(1000);
			//Thread.currentThread().interrupt();

		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("State of ticket after calling .sleep() method - "+tick.getState() );


		try
		{
			// waiting for tick to die
			tick.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("State of ticket when ticket booked:- " +tick.getState());
	}
}
