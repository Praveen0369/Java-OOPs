package days_In_Month;
import java.util.Scanner;
public class Days_OfMonth {
	Scanner sc= new Scanner(System.in);
	public void calculate() 
	{
		System.out.println("ENTER THE MONTH IN NO FIND DAYS\n(Ex:1 for JANAUARY)\n ");
		int a=sc.nextInt();
		int D=31;
		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
		{
			System.out.println("No Of Days ="+D);
		}
		else if(a==4||a==6||a==9||a==11)
		{
			D-=1;
			System.out.println("No Of Days ="+D);
		}
		else
		{
			System.out.println("Month Selected is Febrauary\nENTER THE YEAR TO PROVIDE CRT DAYS");
			int year=sc.nextInt();
			if(year%4!=0)
			{
				D-=3;
				System.out.println("No Of Days ="+D);
			}
			else
			{
				D-=2;
				System.out.println("No Of Days ="+D);
			}
		}
	}
	public static void main(String[] args) {
	
		Days_OfMonth O =new Days_OfMonth();
		O.calculate();
		
	}

}
