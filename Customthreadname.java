class Customthreadname extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  Customthreadname t1=new Customthreadname();  
  Customthreadname t2=newCustomthreadname();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Scooby");
  t2.setName("Shaggy");
  System.out.println("After changing name of t1:"+t1.getName()); 
  System.out.println("After changing name of t2:"+t2.getName());
 }  
}
