public class ElememtGenerics{  
  
   public static < E > void printAr(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
    public static void main( String args[] ) {  
        Integer[] intarray = { 10, 20, 30, 40, 50 };  
        Character[] chararray = { 'J', 'A', 'V', 'A' };  
        String[] strarray = {"JAVA","OOP"};
        Float[] floatarray={0.0f,2.2f,7.7f};
        Double[] doublearray={3.3,4.4,2.5,23.0};
        
        System.out.println( "Printing Double Array" );  
        printAr( doublearray  );
        
        System.out.println( "Printing Float Array" );  
        printAr( floatarray  ); 
        
         System.out.println( "Printing String Array" );  
        printAr( strarray  );  
  
        System.out.println( "Printing Integer Array" );  
        printAr( intarray  );   
  
       System.out.println( "Printing Character Array" );  
        printAr( chararray );   
    }   
}  
