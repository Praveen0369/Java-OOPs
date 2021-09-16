interface illai
{  
public void print();  
}  
 
public class interfacebasic implements illai
{  
    public void print()
    {
        System.out.println("Aprom Epdi iruka?");
    }  
  
public static void main(String args[])
{  
    interfacebasic obj = new interfacebasic();  
	obj.print();  
 }  
}  
