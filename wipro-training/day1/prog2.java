//Write a program to accept two numbers and print the greater value of the two
package basic;
import java.util.*;
public class prog2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number1 :");
		int inp1=sc.nextInt();
		System.out.print("Enter number2 :");
		int inp2=sc.nextInt();
		sc.close();
		if(inp1<inp2) {
			System.out.println(inp2+" is greater than "+inp1);
		}
		else {
			System.out.println(inp1+" is greater than "+inp2);
		}
		
	}

	}






