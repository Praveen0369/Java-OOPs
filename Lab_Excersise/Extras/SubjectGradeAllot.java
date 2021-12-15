package readsubject;
import java.util.Scanner;
public class SubjectGradeAllot {
 double Totalmarks;
 double sub1;
 double sub2;
 double sub3;
 double sub4;
 double sub5;
 void input_data ()
 {
   Scanner sc = new Scanner (System.in);
     System.out.println ("\n Enter Subject 1 Marks: ");
     sub1 = sc.nextInt ();
     System.out.println ("\n Enter Subject 2 Marks: ");
    sub2 = sc.nextInt();
     System.out.println ("\n Enter Subject 3 Marks: ");
     sub3 = sc.nextInt ();
     System.out.println ("\n Enter Subject 4 Marks:");
     sub4 = sc.nextInt ();
     System.out.println ("\nEnter Subject 5 Marks:");
     sub5 = sc.nextInt();
     sc.close();
 }
 public void grade(double a) 
 {
	 
	 if(a<0||a>100)
	 {
		 System.out.print("!!Enter Valid Mark!!");
	 }
	 else {
		 System.out.println("Grade\tGrade Points");
	 if(a>=90)
	 {
		 String g="O";
		 System.out.print(g+"\t10");
	 }
	 else if(a>=80 && a<90)
	 {
		 String g="A+";
		 System.out.print(g+"\t9");
	 }
	 else if(a>=70 && a<80)
	 {
		 String g="A";
		 System.out.print(g+"\t8");
	 }
	 else if(a>=60 && a<70)
	 {
		 String g="B+";
		 System.out.print(g+"\t7");
	 }
	 else if(a>=50 && a<60)
	 {
		 String g="B";
		 System.out.print(g+"\t6");
	 }
	 else
	 {
		 String g="RA";
		 System.out.print(g+"\t0");
	 }
	}
	 
 }
 void print()
 {
	 double Avg=(sub1+sub2+sub3+sub4+sub5)/5;
	 System.out.println("-------------------------");
	 System.out.println("Subject\t\tMarks");
	 System.out.println("Subject1\t"+sub1);
	 System.out.println("Subject2\t"+sub2);
	 System.out.println("Subject3\t"+sub3);
	 System.out.println("Subject4\t"+sub4);
	 System.out.println("Subject5\t"+sub5);
	 System.out.println("AverageMarks\t"+Avg);
	 grade(Avg);
	 
	 
 }
	public static void main(String[] args) {
		SubjectGradeAllot obj=new SubjectGradeAllot();
		obj.input_data();
		obj.print();
		
		

	}

}
