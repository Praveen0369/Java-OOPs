package swapnumber;
import java.util.*;

public class swapno {

	public static void main(String[] args) {  
		       int a, b, t;  
		       Scanner sc = new Scanner(System.in);  
		       System.out.println("Enter the value of a and b");  
		       a = sc.nextInt();  
		       b = sc.nextInt();  
		       System.out.println("before swapping numbers: "+a +"  "+ b);  
		       t = a;  
		       a = b;  
		       b = t;  
		       System.out.println("After swapping: "+a +"   " + b);  
		       System.out.println( );  
		    }    
		
	}
