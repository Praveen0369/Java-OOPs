
package palindromestr;
import java.util.*;

public class palindromeofstring {

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		 System.out.println("Enter The string to check wheather it is palindrome or not");
		Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        str2.reverse();
        String rev=str2.toString();  
        if(str1.equals(rev))
        {
        System.out.println(str1+" Is A Palindrome");
        }
        else
        {
            System.out.println(str1+" Is Not A Palindrome");
        }
        Default:
            System.out.println("***********************");
		}
        

	}
