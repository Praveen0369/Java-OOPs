/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Praveen
 */
import java.io.*;
abstract class fibo1
{
    int n;
    int d;
    int a=0;
         int b=1;
          int c;
    abstract void fibonaci();
}
public class Abs_Fibbonacci {
    public static void main(String[] args) throws Exception
 {
     fibo2 obj = new fibo2();
     obj.fibonaci();
 }
}
class fibo2 extends fibo1
{
    
    void fibonaci()
    {
        try{
        File file = new File("C:\\Users\\Prabha\\Pictures\\bot.txt");
         FileReader fin= new FileReader(file);
         while ((n=fin.read())!= -1){
             System.out.println("Fibonacci series upto "+n+" is :-");
             d=n;
         }
         
      while(c<d)
         {
             System.out.print(c+" ");
             c=a+b;
             a=b;
             b=c;
             
         }
       
         
         
        }catch(IOException e)
        {}
}
}


