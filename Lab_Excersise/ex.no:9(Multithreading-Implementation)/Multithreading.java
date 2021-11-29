package multithreading_implementation;
import java.util.*;
class even implements Runnable
{
	public int x;
	public even(int x)
	{
		this.x=x;
	}
	public void run()
	{
	System.out.println("This Thread "+x+" is Even and it's square is "+x*x);
	}
}
class odd implements Runnable
{
	public int x;
	public odd(int x)
	{
		this.x=x;
	}
	public void run()
	{
	System.out.println("This Thread "+x+" is Even and it's cube is "+x*x*x);
	}
}
public class Multithreading extends Thread {
	public void run() {
	int num=0;
	Random r= new Random();
	try {
		for(int i=0;i<8;i++)
		{
			num=r.nextInt(100);
			System.out.println("Main Thread And generated number is "+num);
			if(num%2==0)
			{
				Thread t1= new Thread(new even(num));
				t1.start();
			}
			else 
			{
				Thread t2= new Thread(new odd(num));
				t2.start();
			}
			Thread.sleep(1000);
			System.out.println("-------------------------------");
		}
		
	}catch(Exception ex) 
	{
		ex.getMessage();
	}
	}
	public static void main(String[] args) {
		Multithreading obj= new Multithreading();
		obj.start();

	}

}
