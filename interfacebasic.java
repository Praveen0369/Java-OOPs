interface illai
{  
public void print();  
}  
 
public class onnum implements illai
{  
    public void print()
    {
        System.out.println("Onnum illai");
    }  
  
public static void main(String args[])
{  
    onnum obj = new onnum();  
	obj.print();  
 }  
}  
