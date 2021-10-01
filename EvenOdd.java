import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[])
  {
    int num1;
    System.out.println("Enter an Integer number:");
    Scanner input = new Scanner(System.in);
    num1 = input.nextInt();

    if ( num1 % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
