public class NaNoperations {
 
 public static void main(String[] args) {
     double x = 1;
System.out.println(x + " is NaN = " + (x != x));
System.out.println(x + " is NaN = " + (Double.isNaN(x)));
        
x = Double.NaN;
System.out.println(x + " is NaN = " + (x != x));
System.out.println(x + " is NaN = " + (Double.isNaN(x)));
     Double NAN=Double.NaN;
 System.out.println("Infinite Loop");
 System.out.println("NaN == 1 = " + (NAN == 1));
System.out.println("NaN > 1 = " + (NAN > 1));
System.out.println("NaN < 1 = " + (NAN < 1));
System.out.println("NaN != 1 = " + (NAN != 1));
System.out.println("NaN == NaN = " + (NAN == NAN));
System.out.println("NaN > NaN = " + (NAN > NAN));
System.out.println("NaN < NaN = " + (NAN < NAN));
System.out.println("NaN != NaN = " + (NAN != NAN));
 }
 }
