class boss
{
    public void print(int n)
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}
class mythread1 extends Thread{
    boss t;
    mythread1(boss t){
        this.t=t;
    }public void run(){
        
        t.print(5);
    }
}
class mythread2 extends Thread{
    boss t;
    mythread2(boss t){
        this.t=t;
    }public void run(){
        t.print(100);
    }
    }
public class threadsynchronization{
    public static void main(String args[]){
        boss ob=new boss();
        mythread1 o=new mythread1(ob);
        mythread2 b= new mythread2(ob);
        b.start();
        o.start();
    }
}
