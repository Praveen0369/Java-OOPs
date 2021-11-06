public class DaemonThread1 extends Thread{  
 public void run(){  
  if(Thread.currentThread().isDaemon()){ 
   System.out.println("daemon thread work");  
  }  
  else{  
  System.out.println("user thread work");  
 }  
 }  
 public static void main(String[] args){  
  DaemonThread1 t1=new DaemonThread1();
  DaemonThread1 t2=new DaemonThread1();  
  DaemonThread1 t3=new DaemonThread1();  
  
  t1.setDaemon(true);
    
  t1.start();
  t2.start();  
  t3.start();  
 }  
}  
