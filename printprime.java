package printprimeno;
class inheritance2
{
	int i;int count;int n=100;
   public void primeupton()
   {
	   for(int j=2;j<=n;j++)
		{
		count=0;
		for(i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.println(j+"  ");     
		}
		}
   }

public class printprimeno extends inheritance2
{
	public static void main(String[] args) 
	{
		printprime obj =new printprime();
		       obj.primeupton();
	}

}
