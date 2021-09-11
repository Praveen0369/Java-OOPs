public class factorialCalculation
{
void factorial(int n)
{
int factorial=1;
for(int i=1;i<=n;i++)
{
factorial=factorial*i;
}
System.out.println("factorial is "+factorial);
}
public static void main(String args[])
{
new factorialCalculation().factorial(6);
 }
}
