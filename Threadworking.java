class ThreadDem extends Thread {
   private Thread t;
   private String threadName;
   
   ThreadDem( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 3; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class Threadworking {

   public static void main(String args[]) {
      ThreadDem o = new ThreadDem( "Thread-1");
      o.start();
      
      ThreadDem u = new ThreadDem( "Thread-2");
      u.start();
   }   
}
