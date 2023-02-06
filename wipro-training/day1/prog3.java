//-	Write a program to accept a number N and print whether the number is EVEN or ODD
package basic;
import java.util.*;

public class prog3 {

	public static void main(String[] args) {
		System.out.print("Enter number :");
		Scanner sc= new Scanner(System.in);
		int inp=sc.nextInt();
		if(inp%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}

	}

}
