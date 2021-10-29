public class JavaSuspend extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            { 
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
     
        JavaSuspend t1=new JavaSuspend ();    
        JavaSuspend t2=new JavaSuspend ();   
        JavaSuspend t3=new JavaSuspend ();  
        t1.start();  
        t2.start();
        t2.suspend();   
        t3.start();  
    }    
}  
