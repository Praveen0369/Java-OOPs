package inheritance;

public class inheritanceExmp {
 double bspay= 20000;
}
class employee extends inheritanceExmp{  
	 int bonus=10000;  
	 public static void main(String args[]){  
		 double add;
	   employee p=new employee(); 
	    add=(p.bspay+p.bonus);
	   System.out.println("employee pay is:"+p.bspay);  
	   System.out.println("Bonus of employee is:"+p.bonus);  
	   System.out.println("Total pay:"+add); 
	 }
}
