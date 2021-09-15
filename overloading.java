public class overloading
{  
	  void bot(int a,int b)
{
    System.out.println(a+b);
    
}  
	  void bot(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[])
{  
	  overloading o=new overloading();  
	  o.bot(10,20,10);  
	  o.bot(20,20);  
	  
	  }  
	}  
