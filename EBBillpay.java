import java.util.Scanner;

class EBBillpay
{
  int cno;
  String cname;
  int pm_reading;
  int cm_reading;
  String EBCon;
  double Billpay;

  void input_data ()
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("\n Enter Consumer Number: ");
      cno = sc.nextInt ();
      System.out.println ("\n Enter Consumer Name: ");
      cname = sc.next ();
      System.out.println ("\n Enter Previous Units: ");
      pm_reading = sc.nextInt ();
      System.out.println ("Enter Current Units consumed:");
      cm_reading = sc.nextInt ();
      System.out.
      println ("Enter the types of EB Connection(domestic or commercial)");
      EBCon = sc.next ();
  }

  double calculate_Billpay ()
  {
    int choice;
    if (EBCon == "domenstic")
      choice = 1;
    else
      choice = 2;
    switch (choice)
      {
      case 1:
	if (cm_reading >= 0 && cm_reading <= 100)
	  Billpay = cm_reading * 1;
	else if (cm_reading > 100 && cm_reading <= 200)
	  Billpay = (100 * 1) + ((cm_reading - 100) * 2.50);
	else if (cm_reading > 200 && cm_reading <= 500)
	  Billpay = (100 * 1) + (100 * 2.50) + ((cm_reading - 200) * 4);
	else
	  Billpay =
	    (100 * 1) + (100 * 2.50) + (300 * 4) + ((cm_reading - 500) * 6);
	break;
      case 2:
	if (cm_reading >= 0 && cm_reading <= 100)
	  Billpay = cm_reading * 2;
	else if (cm_reading > 100 && cm_reading <= 200)
	  Billpay = (100 * 1) + ((cm_reading - 100) * 4.50);
	else if (cm_reading > 200 && cm_reading <= 500)
	  Billpay = (100 * 1) + (100 * 2.50) + ((cm_reading - 200) * 6);
	else
	  Billpay =
	    (100 * 1) + (100 * 2.50) + (300 * 4) + ((cm_reading - 500) * 7);
	break;
      }
    return Billpay;
  }
  void display ()
  {
    System.out.println ("----------------------------------");
    System.out.println ("ELCTRICITY Billpay");
    System.out.println ("----------------------------------");
    System.out.println ("Consumer Number: " + cno);
    System.out.println ("Consumer Name: " + cname);
    System.out.println ("Consumer Previous Units: " + pm_reading);
    System.out.println ("Consumer Current Units: " + cm_reading);
    System.out.println ("Type of EBConection: " + EBCon);
    System.out.println ("----------------------------------");
    System.out.println ("Total Amount(Rs.): " + Billpay);
  }
}

class Main
{

  public static void main (String[]args)
  {
    EBBillpay b = new EBBillpay ();
      b.input_data ();
      b.calculate_Billpay ();
      b.display ();
  }
}
