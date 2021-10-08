import java.io.*;
interface Stackoperation 
{
	public void push();
	public void pop();
	public void display();
}

class StackADT implements Stackoperation 
{
	int size=5;
    int stack[]=new int[size];
    int top=-1;
    public void push()
    {
    	try
        {    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(top==(size-1))
        {
            System.out.println(" Stack Overflow");
            return;
        }
        else
        {
            System.out.println("Enter the element");
            int ele=Integer.parseInt(br.readLine());
            stack[++top]=ele;
        }
       }
    	catch(IOException e)
        {
            System.err.println(e);
        }
    }
    public void pop()
    {
    	 if(top<0)
         {
             System.out.println("Stack underflow");
             return;
         }
         else
         {
             int popper=stack[top];
             top--;
             System.out.println("Popped element:" +popper);
         }
    }
    public void display()
    {
    	 if(top<0)
         {
             System.out.println("Stack is empty");
             return;
         }
         else
         {
             String str=" ";
             for(int i=0; i<=top; i++)
                 str=str+"  "+stack[i]+" <--";
             System.out.println("Elements are:"+str);
         }
    }
}

/*  MAIN METHOD */
public class teststack extends StackADT
{
	public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Implementation of Stack using Array");
        StackADT o=new StackADT();
        int ch=0;
        do
        {
        	System.out.println("1.Push 2.Pop 3.Display 4.Exit");
        	System.out.println("Enter your choice:");
        	ch=Integer.parseInt(br.readLine());
        	switch(ch)
        	{
        		case 1:
        			o.push();
        			break;
        		case 2:
        			o.pop();
        			break;
        		case 3:
        			o.display();
        			break;
        		case 4:
        			System.exit(0);
        		default:
                    System.exit(0);
                    break;
        	}
        } while(ch<5);
       
    }
}
