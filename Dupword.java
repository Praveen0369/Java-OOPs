public class DupWord {  
    public static void main(String[] args) {  
        String str = "Big is big basket";  
        int count;  
          
     
        str = str.toLowerCase();  
          
   
        String wor[] = str.split(" ");  
          
        System.out.println("Duplicate words in a given string : ");   
        for(int i = 0; i < wor.length; i++) {  
            count = 1;  
            for(int j = i+1; j < wor.length; j++) {  
                if(wor[i].equals(wor[j])) {  
                    count++;  
                   
                    wor[j] = "0";  
                }  
            }  
              
              
            if(count > 1 && wor[i] != "0")  
                System.out.println(wor[i]);  
        }  
    }  
}  
