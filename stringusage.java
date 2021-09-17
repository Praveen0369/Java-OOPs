interface inherit
{
    public void val1();
    public void val2();
    
}
public class stringusage implements inherit 
{    
    String str1="   jaVa Programming";
    
    public void val1()
        {
            str1=str1.toUpperCase();
            System.out.println("**********Upper case*********");
            System.out.println(""+str1);
            System.out.println("**********Lower case*********");
            str1=str1.toLowerCase();
            System.out.println(""+str1);
            System.out.println("******post-pre trimming******");
            str1=str1.trim();
            System.out.println(""+str1);
            System.out.println("******searching******");
            System.out.println(str1.contains("x"));
            System.out.println("******Length******");
            System.out.println(str1.length());
        }
    public void val2()
        {
            System.out.println("******Ends With******");
             System.out.println(str1.endsWith("ming"));
             System.out.println("******String To CharArray******");
             char[] str2= str1.toCharArray();
             System.out.println(str2);
             System.out.println("******Selecting character by position******");
              System.out.println(str1.charAt(6));
        }
    
    public static void main(String args[]) 
    {
        stringusage o=new stringusage();
        o.val1();
        o.val2();
       
    
    }
}
