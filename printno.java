package printprimeno;
class inheritance2
{
	int i=0;int n=101;
   public void primeupton()
   {
       for(i=0;i<n;i++) 
       {
    	   System.out.println(i);
       }
   }
}
public class printno extends inheritance2 {
	public static void main(String[] args) 
	{
		printno obj =new printno();
		       obj.primeupton();
	}

}
