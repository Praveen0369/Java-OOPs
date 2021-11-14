import java.util.*; 
public class ElectricityBill
{ 
 public static void main (String args[]) 
{ 
Customerdata ob = new Customerdata(); 
ob.getdata(); 
ob.calc(); 
ob.display(); 
} 
} 
class Customerdata
{ 
Scanner in = new Scanner(System.in); 
Scanner ins = new Scanner(System.in); 
String cname,type; 
int bn; 
double current,previous,tbill,units; 
void getdata() 
{ 
System.out.print ("\n\t Enter consumer number : "); 
bn = in.nextInt(); 
System.out.print ("\n\t Enter Type of connection (D for Domestic or C for Commercial) : "); 
type = ins.nextLine(); 
System.out.print ("\n\t Enter consumer name :"); 
cname = ins.nextLine(); 
System.out.print ("\n\t Enter previous month reading :"); 
previous= in.nextDouble(); 
System.out.print ("\n\t Enter current month reading :"); 
current= in.nextDouble(); 
}void calc() 
{ 
units=current-previous; 
if(type.equals("D")) 
{ 
if (units<=100) 
tbill=0 * units; 
else if (units>100 && units<=200) 
tbill=100*0+(units-100)*1.5;
else if(units>200 && units<=500) 
tbill= 100*0+(100*2)+(units-200)*3; 
else 
tbill= 100*0+(100*3.5)+(200*4.6)+(units-500)*6.6; 
} 
else 
{ 
if (units<=100) 
tbill= 2.50 * units; 
else if(units>100 && units<=200) 
tbill=100*2.50+(units-100)*3.5; 
else if(units>200 && units<=500) 
tbill=100*2.50+(100*3.5)+(units-200)*4.60; 
else 
tbill= 100*2.50+(100*3.5)+(200*4.6)+(units-500)*6.6; 
} 
} 
void display() 
{ 
    System.out.println("\n\t*************************************");
    System.out.println("***********BILL PAY RECIEPT**********");
    System.out.println("*************************************");
System.out.println("\n\t Consumer number = "+bn); 
System.out.println ("\n\t Consumer name = "+cname); 
if(type.equals("D")) 
System.out.println ("\n\t type of connection = DOMESTIC "); 
else 
System.out.println ("\n\t type of connection = COMMERCIAL "); 
System.out.println ("\n\t Current Month Reading = "+current); 
System.out.println ("\n\t Previous Month Reading = "+previous); 
System.out.println ("\n\t Total units = "+units); 
System.out.println ("\n\t Total bill = RS "+tbill); 
} 
} 
