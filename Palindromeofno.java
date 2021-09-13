public class Palindromeofno
{  
 public static void main(String args[])
 {  
  int r,add=0,temp;    
  int n=252;
  temp=n;    
  while(n>0)
  {    
   r=n%10;  
   add=(add*10)+r;    
   n=n/10;    
  }    
  if(temp==add)    
   System.out.println("palindrome number "+add);    
  else    
   System.out.println("not palindrome");    
}  
} 
